package org.headfirst.pattern.Ducks;

import org.headfirst.pattern.Flys.FlyNoWay;
import org.headfirst.pattern.Quacks.MuteQuack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	public void display() {
		System.out.println("I'm a Rubber duck.");
	}

}
