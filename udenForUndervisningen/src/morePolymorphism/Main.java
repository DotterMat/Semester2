package morePolymorphism;

public class Main {
    public static void main(String[] args) {
        Car c1 = new ElectricCar(250,500,"Toyota 95B");
        Car c2 = new GasPoweredCar("Lamborghini 72ti",21,8);
        Car c3 = new HybridCar("Suzuki 22",20,31,6);
        runCar(c3);
    }
    public static void runCar(Car car) {
        car.startEngine();
        car.drive();
    }
}
