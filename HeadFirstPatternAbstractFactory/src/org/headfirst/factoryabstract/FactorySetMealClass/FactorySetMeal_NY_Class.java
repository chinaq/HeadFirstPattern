package org.headfirst.factoryabstract.FactorySetMealClass;

import org.headfirst.factoryabstract.SetMeals.SetMeal;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;
import org.headfirst.factoryabstract.SetMeals.SetMeal_A_NY;
import org.headfirst.factoryabstract.SetMeals.SetMeal_B_NY;
import org.headfirst.factoryabstract.SetMeals.SetMeal_C_NY;

public class FactorySetMeal_NY_Class {
	public SetMeal createSetMealClass(SetMealStyle setMealStyle) {

		SetMeal setMeal;

		if (SetMealStyle.A == setMealStyle)
			setMeal = new SetMeal_A_NY();
		else if (SetMealStyle.B == setMealStyle)
			setMeal = new SetMeal_B_NY();
		else
			setMeal = new SetMeal_C_NY();

		return setMeal;
	}
}
