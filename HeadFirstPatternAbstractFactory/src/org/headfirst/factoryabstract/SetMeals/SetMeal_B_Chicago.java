package org.headfirst.factoryabstract.SetMeals;

import org.headfirst.factoryabstract.FactoryAbstract.B_Chicago_SetMealFactory;

public class SetMeal_B_Chicago extends SetMeal{
	public SetMeal_B_Chicago(){
		setMealFactory = new B_Chicago_SetMealFactory();
		System.out.println("new a set Meal B Chicago");
	}
}
