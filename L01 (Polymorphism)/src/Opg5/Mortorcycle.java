package Opg5;

public class Mortorcycle extends Vehicle {
    private int engineSize;

    public Mortorcycle(int engineSize, String make, String model, int year, double mileage) {
        super(make, model,year,mileage);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("EngineSize: " + engineSize + " cm ");
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
        System.out.println("Activating water mode: ");
    }
}
