package org.headfirst.factoryabstract.SetMeals;

import org.headfirst.factoryabstract.FactoryAbstract.B_NY_SetMealFactory;

public class SetMeal_B_NY extends SetMeal {

	public SetMeal_B_NY() {
		setMealFactory = new B_NY_SetMealFactory();
		System.out.println("new a set Meal B NY");
	}
}
