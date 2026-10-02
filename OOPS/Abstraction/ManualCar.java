package Abstraction;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("Hi you are in manual car");
    }

    @Override
    public void brake() {
        System.out.println("You are braking a manual car");
    }

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println("You are driving car at " + speed);
    }

    public void changeGear() {
        System.out.println("Gear have been shifted");
    }
}
