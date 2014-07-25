package org.headfirst.pattern.Ducks;

import org.headfirst.pattern.Flys.FlyWithWings;
import org.headfirst.pattern.Quacks.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display(){
		System.out.println("I'm a real Mallard duck.");
	}
}
