package org.headfirst.factoryabstract.SetMeals;

import org.headfirst.factoryabstract.FactoryAbstract.A_Chicago_SetMealFactory;

public class SetMeal_A_Chicago extends SetMeal{
	public SetMeal_A_Chicago(){
		setMealFactory = new A_Chicago_SetMealFactory();
		System.out.println("new a set Meal A Chicago");
	}
}
