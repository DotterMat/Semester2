package Composition2JavaMasterclass;

import java.lang.management.BufferPoolMXBean;

public class DishWasher extends SmartKitchen{
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo,Refrigerator icebox, DishWasher dishWasher,CoffeeMaker coffeeMaker) {
        super(icebox,dishWasher,coffeeMaker);
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDished() {
        System.out.println("You do a dish... ");
        hasWorkToDo = false;
    }
}
