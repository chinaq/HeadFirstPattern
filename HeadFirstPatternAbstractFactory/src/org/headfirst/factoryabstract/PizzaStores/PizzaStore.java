package org.headfirst.factoryabstract.PizzaStores;

import org.headfirst.factoryabstract.SetMeals.SetMeal;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;

public abstract class PizzaStore {

	abstract SetMeal createSetMeal(SetMealStyle setMealStyle);

	//订购套餐后的流程
	public SetMeal orderSetMeal(SetMealStyle setMealStyle) {
		SetMeal setMeal;
		System.out.println("orderred a set meal: " + setMealStyle.toString());

		setMeal = createSetMeal(setMealStyle);	//创建套餐内的所有内容（pizza，drink，bread）
		setMeal.prepare();			//准备完毕
		setMeal.box();				//打包完毕

		System.out.println("give you a set meal");
		return setMeal;
	}
}
