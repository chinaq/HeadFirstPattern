package org.headfirst.factoryabstract.PizzaStores;

import org.headfirst.factoryabstract.FactorySetMealClass.FactorySetMeal_Chicago_Class;
import org.headfirst.factoryabstract.SetMeals.SetMeal;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;

public class ChicagoStylePizzaStore extends PizzaStore{

	public ChicagoStylePizzaStore() {
		System.out.println("new a chicago pizza store");
	}

	// /具体创建套餐内容
	@Override
	SetMeal createSetMeal(SetMealStyle setMealStyle) {
		SetMeal setMeal;

		FactorySetMeal_Chicago_Class factorySetMealClass = new FactorySetMeal_Chicago_Class();
		setMeal = factorySetMealClass.createSetMealClass(setMealStyle);

		System.out.println("new a Chicago class factory");
		return setMeal;
	}
}
