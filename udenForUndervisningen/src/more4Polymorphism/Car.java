public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = false;
        this.wheels = 0;
    }
    public void startEngine() {
        System.out.println("the car's engine is starting");
    }
    public void accelerate() {
        System.out.println("the car is accelerating");
    }
    public void brake() {
        System.out.println("the car is braking");
    }
    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

}
class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders,name);
    }
    @Override
    public void startEngine() {
        super.startEngine();
    }
    @Override
    public void accelerate() {
        super.accelerate();
    }
    @Override
    public void brake() {
        super.brake();
    }
}
class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders,name);
    }
    @Override
    public void startEngine() {
        super.startEngine();
    }
    @Override
    public void accelerate() {
        super.accelerate();
    }
    @Override
    public void brake() {
        super.brake();
    }
}
   class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders,name);
    }
    @Override
    public void startEngine() {
        super.startEngine();
    }
    @Override
    public void accelerate() {
        super.accelerate();
    }
    @Override
    public void brake() {
        super.brake();
    }
}

