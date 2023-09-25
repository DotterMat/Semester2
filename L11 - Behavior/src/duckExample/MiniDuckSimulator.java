package duckExample;

import strategy.ducks.*;
import strategy.flybehaviors.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println("Mallard duck:");
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();
		System.out.println();

		Duck model = new ModelDuck();
		System.out.println("Model duck:");
		model.display();
		model.swim();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		System.out.println();

		Duck redhead = new RedheadDuck();
		System.out.println("Redhead duck:");
		redhead.display();
		redhead.performFly();
		redhead.performQuack();
		System.out.println();

		Duck rubber = new RubberDuck();
		System.out.println("Rubber duck:");
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		System.out.println();

		Duck decoy = new DecoyDuck();
		System.out.println("Decoy duck:");
		decoy.display();
		decoy.performFly();
		decoy.performQuack();
		System.out.println();
	}
}
