package Abstraction;

public class ElectricCar extends Car {
    @Override
    public void drive() {
        System.out.println("hi you are driving a electric car");
    }

    @Override
    public void brake() {

        System.out.println("you are braking a electric car ");
    }

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println(" you are speeding electric car to " + speed);
    }
}
