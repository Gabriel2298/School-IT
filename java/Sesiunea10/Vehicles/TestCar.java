package Sesiunea10.Vehicles;
//Package 2: Multilevel Inheritance
//Domain Model: Cars
//Classes:
//        Car
//        ElectricCar (inherits from Car)
//        Tesla (inherits from ElectricCar)
//Attributes:
//        Car: make, model, year
//        ElectricCar: batteryCapacity, range
//        Tesla: autopilotVersion
//Methods:
//        Car: start(), stop(), accelerate()
//        ElectricCar: charge()
//        Tesla: enableAutopilot()

public class TestCar {
    public static void main(String... args) {
        Tesla myTesla = new Tesla("Tesla","Model 3 ", 2021, 150,350,"Full control!");
        myTesla.start();
        myTesla.accelerate();
        myTesla.charge();
        myTesla.enableAutopilot();
        myTesla.stop();
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Car started: " + make + " " + model);
    }

    public void stop() {
        System.out.println("Car stopped: " + make + " " + model);
    }

    public void accelerate() {
        System.out.println("Car accelerated " + make + " " + model);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity; // in kwh
    private int range; // in Km

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    public void charge(){
        System.out.println("Car battery charge: " + batteryCapacity + "Kwh");
    }
}
class Tesla extends ElectricCar{
    private String autopilotVersion;


    public Tesla(String make, String model, int year, int batteryCapacity, int range, String autopilotVersion) {
        super(make, model, year, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }
    public void enableAutopilot(){
        System.out.println("Autopilot enable version: " + autopilotVersion);
    }
}