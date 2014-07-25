package org.headfirst.factoryabstract.FactorySetMealClass;

import org.headfirst.factoryabstract.SetMeals.SetMeal;
import org.headfirst.factoryabstract.SetMeals.SetMeal_A_Chicago;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;
import org.headfirst.factoryabstract.SetMeals.SetMeal_B_Chicago;
import org.headfirst.factoryabstract.SetMeals.SetMeal_C_Chicago;

public class FactorySetMeal_Chicago_Class {
	public SetMeal createSetMealClass(SetMealStyle setMealStyle) {

		SetMeal setMeal;

		if (SetMealStyle.A == setMealStyle)
			setMeal = new SetMeal_A_Chicago();
		else if (SetMealStyle.B == setMealStyle)
			setMeal = new SetMeal_B_Chicago();
		else
			setMeal = new SetMeal_C_Chicago();

		return setMeal;
	}
}
