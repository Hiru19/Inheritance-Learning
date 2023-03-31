public class Vehicle {
    void drive(){
        System.out.println("Driving");
    }
    void vehicleBreak(){
        System.out.println("Driving");
    }
    void reverse(){
        System.out.println("reverse!");
    }
}
class Car extends  Vehicle{
    void motorRacing(){
        System.out.println("Racing");
    }
}
class ModernCar extends  Car{
    void flying(){
        System.out.println("flying!");
    }
}
class Boat extends  Vehicle{
    void surf(){
        System.out.println("Surfing");
    }
}
class ModernBoat extends  Boat{
    void landRidding(){
        System.out.println("Ridding");
    }
}
class TestOutput{
    public static void main(String[] args) {
        ModernCar mc= new ModernCar();
        ModernBoat mb=new ModernBoat();
        mc.drive();
        mc.reverse();
        mc.vehicleBreak();
        mc.motorRacing();
        mc.flying();
        mb.drive();
        mb.reverse();
        mb.vehicleBreak();
        mb.surf();
        mb.landRidding();
    }
}