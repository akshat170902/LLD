package Abstraction;

import java.sql.Array;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("hi you are in manual car");
    }

    @Override
    public void brake() {
        System.out.println(" You are braking a manual car");
    }

    @Override
    public void drive(int speed) {
        this.speed=speed;
        System.out.println(" you are driving car at "+speed);
    }
}
