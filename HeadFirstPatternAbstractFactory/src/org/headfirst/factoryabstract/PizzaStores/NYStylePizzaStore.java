package org.headfirst.factoryabstract.PizzaStores;

import org.headfirst.factoryabstract.FactorySetMealClass.FactorySetMeal_NY_Class;
import org.headfirst.factoryabstract.SetMeals.SetMeal;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;

public class NYStylePizzaStore extends PizzaStore {

	public NYStylePizzaStore() {
		System.out.println("new a NY pizza store");
	}

	// /具体创建套餐内容
	@Override
	SetMeal createSetMeal(SetMealStyle setMealStyle) {
		SetMeal setMeal;

		FactorySetMeal_NY_Class factorySetMealClass = new FactorySetMeal_NY_Class();
		setMeal = factorySetMealClass.createSetMealClass(setMealStyle);

		System.out.println("new a NY class factory");
		return setMeal;

	}

}
