package Composition2JavaMasterclass;

public class Refrigerator extends SmartKitchen{
    private boolean hasWorkToDo;

    public Refrigerator(Refrigerator icebox, boolean hasWorkToDo , DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        super(icebox,dishWasher,coffeeMaker);
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood() {
        System.out.println("Ordering food");
        hasWorkToDo = false;
    }
}

