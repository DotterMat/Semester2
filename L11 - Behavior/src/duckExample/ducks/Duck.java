package duckExample.ducks;

import strategy.flybehaviors.FlyBehavior;
import strategy.quackbehaviors.QuackBehavior;

public abstract class Duck {
    private duckExample.flybehaviors.FlyBehavior flyBehavior;
    private duckExample.quackbehaviors.QuackBehaviorr quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quackf();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
