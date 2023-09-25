package duckExample.ducks;

import strategy.flybehaviors.FlyWithWings;
import strategy.quackbehaviors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
