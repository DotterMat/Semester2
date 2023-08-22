package Opg5;

public class Car extends Vehicle{
    private int numdoors;

    public Car(String make, String model, int year, double mileage, int numdoors) {
        super(make, model, year, mileage);
        this.numdoors = numdoors;
    }

    public int getNumdoors() {
        return numdoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Numdoors: " + numdoors);
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
        System.out.println("We are boosting");
    }
}
