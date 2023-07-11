 abstract class Vehicle{
    abstract void stop();
    abstract void start();
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car started.");
    }
    public void stop(){
        System.out.println( "Car stopped.");
    }
}
class MotorCycle extends Vehicle {
    public void start(){
        System.out.println("MotorCycle started.");
    }
    public void stop(){
        System.out.println( "MotorCycle stopped.");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle motorCycle=new MotorCycle();
        motorCycle.start();
        motorCycle.stop();
       Vehicle car=new Car();
        car.start();
        car.stop();
    }
}