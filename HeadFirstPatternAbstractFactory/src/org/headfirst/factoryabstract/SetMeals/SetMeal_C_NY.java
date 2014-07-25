package org.headfirst.factoryabstract.SetMeals;

import org.headfirst.factoryabstract.FactoryAbstract.C_NY_SetMealFactory;

public class SetMeal_C_NY extends SetMeal {

	public SetMeal_C_NY() {
		setMealFactory = new C_NY_SetMealFactory();
		System.out.println("new a set Meal C NY");
	}
}
