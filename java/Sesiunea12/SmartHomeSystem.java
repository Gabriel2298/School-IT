package Sesiunea12;
//Smart Home Management System
//
//Description:
//           With the rise of the Internet of Things (IoT) and smart devices, homes are becoming increasingly automated.
//           In this system, you are tasked with simulating the working of a Smart Home which integrates various devices,
//           automations, user profiles, and external integrations like weather forecasting.
//
//Functional Requirements
//  User Profiles:
//                Multiple users can be registered to a home: homeowner, family members, and guests.
//                Each user profile has varying control levels: homeowners have full control, family members have partial control
//                (can't add or remove devices), and guests have limited control (can only control devices in common areas).
//                Users should be able to remotely control devices linked to their profile.

//  Device Management:
//                   Various types of devices can be added to the home: lights, thermostats, doors, windows, cameras, entertainment systems, etc.
//                   Each device type can have unique functionalities: lights can dim, thermostats set temperatures, doors can lock/unlock,
//                   cameras can record or take snapshots, etc.
//                   Devices can be assigned to specific rooms or areas.

//Automations & Scenes:
//                    Users can create "scenes" which are predefined settings for multiple devices: e.g., "Night Mode" might dim the lights, lock all doors, and set the thermostat to a particular temperature.
//                    Automations can be created based on triggers: e.g., if the outside temperature drops below a certain level, the heating should turn on.

//External Integrations:
//                     Integrate with a weather service to fetch local weather conditions. This should influence automations:
//                     e.g., if it's about to rain, close all open windows.
//                     Integrate with a local news API to flash breaking news on the entertainment system.

//Energy Management:
//                 Monitor the energy consumption of each device.
//                 Suggest energy-saving automations: e.g., if a room is empty and the lights are on for more than 10 minutes, turn them off.
//                 Generate monthly energy reports showing the consumption patterns and savings from the automations.

//Security and Alerts:
//                   If a door or window is opened at odd hours, send an alert to the homeowner.
//                   Cameras should automatically start recording if an unrecognized face is detected.
//                   If smoke or fire detectors are triggered, alert all users and switch on all lights for safety.
//Voice Commands:
//              Simulate voice commands that users can give to control devices: e.g., "Turn off the living room lights" or "Set thermostat to 22 degrees".

//Maintenance:
//            Devices should have a "health" or "status" associated with them.
//            If a device is malfunctioning or low on battery, an alert should be sent for maintenance.
//            Schedule routine checks for devices.


import java.util.ArrayList;
import java.util.List;

// UserRole Enum
enum UserRole {
    HOMEOWNER, FAMILY_MEMBER, GUEST
}

// Base Device class
abstract class Device {
    String name;
    String location;

    public Device(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public abstract void operate();
}

// User class
abstract class User {
    String name;
    UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public UserRole getRole() {
        return role;
    }

    // Control device functionality
    public void controlDevice(Device device) {
        System.out.println(name + " is operating " + device.getName() + " in " + device.getLocation());
        device.operate();
    }

    // Add device (only for homeowners)
    public void addDevice(Device device, Room room) {
        room.addDevice(device);
    }
}

// Homeowner class with full control
class Homeowner extends User {
    public Homeowner(String name) {
        super(name, UserRole.HOMEOWNER);
    }
}

// Family Member class with partial control
class FamilyMember extends User {
    public FamilyMember(String name) {
        super(name, UserRole.FAMILY_MEMBER);
    }

    @Override
    public void controlDevice(Device device) {
        if (device instanceof SecurityDevice) {
            System.out.println("Access denied: Family members cannot control security devices.");
        } else {
            super.controlDevice(device);
        }
    }

    @Override
    public void addDevice(Device device, Room room) {
        System.out.println("Access denied: Family members cannot add or remove devices.");
    }
}

// Guest class with limited control
class Guest extends User {
    public Guest(String name) {
        super(name, UserRole.GUEST);
    }

    @Override
    public void controlDevice(Device device) {
        if (device instanceof SecurityDevice || !(device.getLocation().equals("Living Room") || device.getLocation().equals("Kitchen"))) {
            System.out.println("Access denied: Guests can only control devices in common areas.");
        } else {
            super.controlDevice(device);
        }
    }

    @Override
    public void addDevice(Device device, Room room) {
        System.out.println("Access denied: Guests cannot add or remove devices.");
    }
}

// Room class
class Room {
    String name;
    List<Device> devices;

    public Room(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getName() + " added to " + name);
    }

    public void listDevices() {
        System.out.println("Devices in " + name + ":");
        for (Device device : devices) {
            System.out.println("- " + device.getName());
        }
    }
}

// Light class
class Light extends Device {
    boolean isOn = false;

    public Light(String name, String location) {
        super(name, location);
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is now OFF.");
    }

    @Override
    public void operate() {
        if (isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }
}

// Thermostat class
class Thermostat extends Device {
    int temperature = 23;

    public Thermostat(String name, String location) {
        super(name, location);
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println(name + " is set to " + temp + "°C.");
    }

    @Override
    public void operate() {
        System.out.println(name + " is maintaining temperature at " + temperature + "°C.");
    }
}

// Security Device Interface
interface SecurityDevice {
    void triggerAlert();
}

// Camera class
class Camera extends Device implements SecurityDevice {
    boolean recording = false;

    public Camera(String name, String location) {
        super(name, location);
    }

    public void startRecording() {
        recording = true;
        System.out.println(name + " started recording.");
    }

    @Override
    public void operate() {
        if (recording) {
            System.out.println(name + " is recording.");
        } else {
            System.out.println(name + " is idle.");
        }
    }

    @Override
    public void triggerAlert() {
        System.out.println("Alert: Unrecognized activity detected by " + name + " in " + location + ".");
        startRecording();
    }
}

// Smoke Detector class
class SmokeDetector extends Device implements SecurityDevice {
    boolean smokeDetected = false;

    public SmokeDetector(String name, String location) {
        super(name, location);
    }

    public void detectSmoke() {
        smokeDetected = true;
        System.out.println("Smoke detected by " + name + " in " + location + "!");
        triggerAlert();
    }

    @Override
    public void operate() {
        System.out.println(name + " is monitoring for smoke.");
    }

    @Override
    public void triggerAlert() {
        System.out.println("Alert: Smoke detected! All users are being alerted.");
    }
}

// Voice Command Handler class
class VoiceCommandHandler {
    public void handleCommand(String command, Device device) {
        if (command.equalsIgnoreCase("turn on light") && device instanceof Light) {
            ((Light) device).turnOn();
        } else if (command.equalsIgnoreCase("set thermostat to 22") && device instanceof Thermostat) {
            ((Thermostat) device).setTemperature(23
            );
        } else {
            System.out.println("Invalid command or incompatible device.");
        }
    }
}

// Device with Health status
class DeviceWithHealth extends Device {
    int batteryLevel;
    boolean malfunctioning = false;

    public DeviceWithHealth(String name, String location) {
        super(name, location);
    }

    @Override
    public void operate() {
        return;
    }

    public void checkHealth() {
        if (batteryLevel < 20) {
            System.out.println(name + " has low battery.");
        }
        if (malfunctioning) {
            System.out.println(name + " is malfunctioning.");
        }
    }

    public void scheduleRoutineCheck() {
        System.out.println(STR."Routine check scheduled for \{name}");
    }
}

// Light with Health status
class LightWithHealth extends Light {
    public LightWithHealth(String name, String location) {
        super(name, location);
    }


    @Override
    public void operate() {
        super.operate();
        checkHealth();
    }

    public void checkHealth() {
        int batteryLevel = 0;
        if (batteryLevel < 20) {
            System.out.println(name + " has low battery. Alerting homeowner.");
        }
    }
}

// Main Smart Home System class
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create Users
        Homeowner homeowner = new Homeowner("Gabi");
        FamilyMember familyMember = new FamilyMember("Maria");
        Guest guest = new Guest("Viorel");

        // Create Rooms
        Room livingRoom = new Room("Living Room");
        Room kitchen = new Room("Kitchen");

        // Create Devices
        LightWithHealth livingRoomLight = new LightWithHealth("Living Room Light", "Living Room");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat", "Living Room");
        Camera securityCamera = new Camera("Security Camera", "Living Room");
        SmokeDetector smokeDetector = new SmokeDetector("Smoke Detector", "Kitchen");
        DeviceWithHealth deviceWithHealth = new DeviceWithHealth("Living Room device.","Living Room");


        // Homeowner adds devices to rooms
        homeowner.addDevice(livingRoomLight, livingRoom);
        homeowner.addDevice(livingRoomThermostat, livingRoom);
        homeowner.addDevice(securityCamera, livingRoom);
        homeowner.addDevice(smokeDetector, kitchen);
        homeowner.addDevice(deviceWithHealth,livingRoom);

        // Control devices
        homeowner.controlDevice(livingRoomLight);
        familyMember.controlDevice(livingRoomThermostat);
        guest.controlDevice(livingRoomLight);

        // Security Alerts
        securityCamera.triggerAlert();
        smokeDetector.detectSmoke();
        securityCamera.startRecording();


        // Voice Command
        VoiceCommandHandler voiceCommandHandler = new VoiceCommandHandler();
        voiceCommandHandler.handleCommand("turn on light", livingRoomLight);
        voiceCommandHandler.handleCommand("set thermostat to 23", livingRoomThermostat);

        // Maintenance check
        livingRoomLight.checkHealth();
        deviceWithHealth.scheduleRoutineCheck();
        deviceWithHealth.checkHealth();
    }
}
