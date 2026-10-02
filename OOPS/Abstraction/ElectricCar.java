package Abstraction;

public class ElectricCar extends Car {
    @Override
    public void drive() {
        System.out.println("Hi you are driving a electric car");
    }

    @Override
    public void brake() {

        System.out.println("You are braking a electric car ");
    }

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println("You are speeding electric car to " + speed);
    }

    public void chargeBattery(){
        System.out.println("Your car battery is being charged");
    }
}
