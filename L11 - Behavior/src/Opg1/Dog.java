package Opg1;

import Opg1.bark.BarkBehavior;
import Opg1.bark.Growl;
import Opg1.diets.DietBehavior;

public abstract class Dog {
    private BarkBehavior barkBehavior;
    private DietBehavior dietBehavior;

    public Dog() {

    }
    public abstract void display();

    public void performBark() {
        barkBehavior.bark();
    }

    public void performDiets() {
        dietBehavior.diet();
    }

    public void running() {
        System.out.println("All dogs running");
    }

    public void setBarkBehavior(BarkBehavior Bb) {
        barkBehavior = Bb;
    }

    public void setDietBehavior(DietBehavior Db) {
        dietBehavior = Db;
    }
}

