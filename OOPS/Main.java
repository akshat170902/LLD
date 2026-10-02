import Abstraction.Car;
import Abstraction.ElectricCar;
import Abstraction.ManualCar;

void main() {
    Car car = new ManualCar();
    car.drive();
    car.brake();
    car.drive(50);
    Car car1 = new ElectricCar();
    car1.brake();
    car1.drive();
    car1.drive(40);

}