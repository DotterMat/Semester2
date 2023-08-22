package morePolymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine() {
        System.out.println("The engine has started... bruuuuhm" + " -> " + getClass().getSimpleName());
    }
    public void drive() {
        System.out.println("We are driving" + " -> " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine() {
        System.out.println("The engine is running -> " + description);
    }
}
