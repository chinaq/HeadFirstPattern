package org.headfirst.factoryabstract.SetMeals;

import org.headfirst.factoryabstract.FactoryAbstract.C_Chicago_SetMealFactory;

public class SetMeal_C_Chicago extends SetMeal{
	public SetMeal_C_Chicago(){
		setMealFactory = new C_Chicago_SetMealFactory();
		System.out.println("new a set Meal C Chicago");
	}
}
