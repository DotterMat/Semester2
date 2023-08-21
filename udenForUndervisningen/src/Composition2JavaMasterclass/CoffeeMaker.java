package Composition2JavaMasterclass;

public class CoffeeMaker extends SmartKitchen{
    private boolean hasWorkToDo;

    public CoffeeMaker(Refrigerator icebox, DishWasher dishWasher, CoffeeMaker coffeeMaker, boolean hasWorkToDo) {
        super(icebox, dishWasher, coffeeMaker);
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}


