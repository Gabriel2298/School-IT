package Sesiunea10.Vehicles;
//  6. Exploring Different Types of Inheritance with the "Vehicles" Domain Model
//  For this exercise, we'll dive into the world of vehicles. Your task is to design three separate packages in Java to demonstrate the three types of inheritance: Single, Multilevel, and Hierarchical.
//
//  Package 1: Single Inheritance
//  Domain Model: Bicycles
//  Classes:
//          Bicycle
//          MountainBike (inherits from Bicycle)
//  Attributes:
//          Bicycle: speed, gear
//          MountainBike: tireType, suspension
//  Methods:
//          Bicycle: changeGear(), speedUp(), applyBrake()
//          MountainBike: adjustSuspension()

public class TestBicyles {
    public static void main(String... args) {
        MountainBike myBike = new MountainBike(25, 2,"Cross", true);
        myBike.speedUp(5);
        myBike.applyBrake(15);
        myBike.adjustSuspension(false);
        myBike.changeGear(3);
    }
}


class Bicycles {
    private int speed;
    private int gear;

    public Bicycles(int speed, int gear) {
        this.gear = gear;
        this.speed = speed;
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println("Gear is change with: " + newGear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("The speed up to " + increment);
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("The speed decrees to " + decrement);
    }
}

class MountainBike extends Bicycles {
    private String tireType;
    private boolean suspension;

    public MountainBike(int speed, int gear, String tireType, boolean suspension) {
        super(speed, gear);
        this.suspension = suspension;
        this.tireType = tireType;
    }

    public void adjustSuspension(boolean haveSuspension) {
        this.suspension = haveSuspension;
        System.out.println("Suspension adjusted: " + (haveSuspension ? "Enable" : "Disable"));
    }
}
