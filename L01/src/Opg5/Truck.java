package Opg5;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, double mileage, double loadCapacity) {
        super(make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Loadcapacity: " + loadCapacity );
    }
    @Override
    public void start() {
        super.start();
    }
    @Override
    public void stop() {
        super.stop();
    }
    protected void action() {
        System.out.println("Activating flying truck");
    }
}
