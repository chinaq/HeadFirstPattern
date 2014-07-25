package org.headfirst.simplefactory.PizzaStores;

import org.headfirst.simplefactory.Pizzas.Pizza;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;
import org.headfirst.simplefactory.SimpleFactorys.SimplePizzaFactory;

public class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(PizzaStyle pizzaStyle) {
		Pizza pizza;
		System.out.println("orderred a pizza");

		pizza = factory.createPizza(pizzaStyle);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		System.out.println("give you a pizza");
		return pizza;
	}
}
