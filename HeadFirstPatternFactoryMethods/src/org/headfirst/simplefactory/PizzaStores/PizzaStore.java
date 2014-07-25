package org.headfirst.simplefactory.PizzaStores;

import org.headfirst.simplefactory.Pizzas.Pizza;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;

public abstract class PizzaStore {

	abstract Pizza createPizza(PizzaStyle pizzaStyle);

	public Pizza orderPizza(PizzaStyle pizzaStyle) {
		Pizza pizza;
		System.out.println("orderred a " + pizzaStyle.name() + " pizza");

		pizza = createPizza(pizzaStyle);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		System.out.println("give you a pizza");
		return pizza;
	}
}
