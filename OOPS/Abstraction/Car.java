package Abstraction;

public abstract class Car {
    protected int speed = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void drive();

    public abstract void brake();

    public abstract void drive(int speed);
}