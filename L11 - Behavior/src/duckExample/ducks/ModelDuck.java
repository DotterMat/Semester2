package duckExample.ducks;

import strategy.flybehaviors.FlyNoWay;
import strategy.quackbehaviors.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
