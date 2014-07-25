package org.headfirst.factoryabstract.SetMeals;

import org.headfirst.factoryabstract.FactoryAbstract.A_NY_SetMealFactory;

public class SetMeal_A_NY extends SetMeal {

	public SetMeal_A_NY() {
		setMealFactory = new A_NY_SetMealFactory();
		System.out.println("new a set Meal A NY");
	}
}
