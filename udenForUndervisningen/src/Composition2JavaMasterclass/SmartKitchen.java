package Composition2JavaMasterclass;

public class SmartKitchen {
    private Refrigerator icebox;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Refrigerator icebox, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        this.icebox = icebox;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public Refrigerator getIcebox() {
        return icebox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
    public void addWater() {
        coffeeMaker.setHasWorkToDo(true);
    }
    public void pourMilk() {
        icebox.setHasWorkToDo(true);
    }
    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }
}
