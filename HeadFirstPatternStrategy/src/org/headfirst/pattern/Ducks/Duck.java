package org.headfirst.pattern.Ducks;

import org.headfirst.pattern.Flys.FlyBehavior;
import org.headfirst.pattern.Quacks.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior ;
	
//	public--都可访问(公有)   
//	protected--包内和子类可访问（保护）
//	不写(default)--包内可访问 （默认）
//	private--类内可访问（私有）
		
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
		System.out.println("set new fly behavior");
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
		System.out.println("set new quack behavior");
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys");		
	}
}
