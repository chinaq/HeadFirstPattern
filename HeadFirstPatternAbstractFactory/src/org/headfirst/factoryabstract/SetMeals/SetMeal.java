package org.headfirst.factoryabstract.SetMeals;

import org.headfirst.factoryabstract.Breads.Bread;
import org.headfirst.factoryabstract.Drinks.Drink;
import org.headfirst.factoryabstract.FactoryAbstract.AbstractFactory;
import org.headfirst.factoryabstract.Pizzas.Pizza;

public abstract class SetMeal { // ����
	Pizza pizza; // ��Ʒ1
	Drink drink; // ��Ʒ2
	Bread bread; // ��Ʒ3

	AbstractFactory setMealFactory;

	void createSetMeal() {
		pizza = setMealFactory.createPizza();
		drink = setMealFactory.createDrink();
		bread = setMealFactory.createBread();
	}

	public void prepare() {
		createSetMeal();
		System.out.println("prepared a set meal");
	}

	public void box() {
		System.out.println("boxed a set Meal");
	}
}
