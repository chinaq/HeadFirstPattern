package org.headfirst.pattern;

import org.headfirst.pattern.Ducks.Duck;
import org.headfirst.pattern.Ducks.MallardDuck;
import org.headfirst.pattern.Ducks.RubberDuck;
import org.headfirst.pattern.Flys.FlyWithWings;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck rubberDuck = new RubberDuck();
		
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		System.out.println("----------------");
		
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.performFly();
		rubberDuck.setFlyBehavior(new FlyWithWings());
		rubberDuck.performFly();
	}

}
