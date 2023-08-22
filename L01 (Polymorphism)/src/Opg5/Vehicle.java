package Opg5;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Vehicle(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void displayInfo() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Make: " + make + ", " +
                " Model: " + model + ", " +
                " Year: " + year + ", " +
                " mileage: " + mileage + ", ");


    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }


    public void start() {
        System.out.println("Vroooom vroooom");

    }

    public void stop() {
        System.out.println("Stopping the car...");
    }
    public void performAction() {
        action();
    }
    protected void action() {
        System.out.println("Performing a vehicle action");
    }
}

