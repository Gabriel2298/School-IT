package Sesiunea10.Vehicles;
//Package 3: Hierarchical Inheritance
//Domain Model: Watercraft
//Classes:
//        Boat
//        SpeedBoat (inherits from Boat)
//        FishingBoat (inherits from Boat)
//Attributes:
//          Boat: length, weight
//          SpeedBoat: maxSpeed, engineType
//          FishingBoat: fishCapacity, typeOfNet
//Methods:
//       Boat: sail()
//       SpeedBoat: turboBoost()
//       FishingBoat: castNet()

public class TestBoat {
    public static void main(String... args) {
        SpeedBoat speedBoat = new SpeedBoat(24, 1200,120,"V8 Engine!");
        FishingBoat fishingBoat = new FishingBoat(35,2400,300, "Nets net!" );

        speedBoat.sail();
        speedBoat.turboBoost();

        fishingBoat.castNet();
        fishingBoat.sail();
    }
}
class Boat{
    private double length;
    private double weight;

    public Boat(double length, double weight){
        this.length = length;
        this.weight = weight;
    }
    public void sail(){
        System.out.println("The boat is sailing ");
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }
}
class SpeedBoat extends Boat{
    private double maxSpeed; // km/h
    private String engineType;

    public SpeedBoat(double length, double weight, double maxSpeed, String engineType) {
        super(length, weight);
        this.engineType = engineType;
        this.maxSpeed = maxSpeed; // km/h
    }
    public void turboBoost(){
        System.out.println("The speed boat speed is in turbo boost mode!");
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public String getEngineType() {
        return engineType;
    }
}
class FishingBoat extends Boat{
    private double fishCapacity; // tone
    private String typeOfNet;

    public FishingBoat(double length, double weight, double fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }
    public void castNet(){
        System.out.println("The fish boat is casting the  net! ");
    }

    public double getFishCapacity() {
        return fishCapacity;
    }

    public String getTypeOfNet() {
        return typeOfNet;
    }
}