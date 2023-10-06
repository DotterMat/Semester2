package duckExample.ducks;

import strategy.flybehaviors.FlyNoWay;
import strategy.quackbehaviors.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBehavior(new Squeak());
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
