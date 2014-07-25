package org.headfirst.simplefactory.SimpleFactorys;

import org.headfirst.simplefactory.Pizzas.CheezePizza;
import org.headfirst.simplefactory.Pizzas.GreekPizza;
import org.headfirst.simplefactory.Pizzas.PepperroniPizza;
import org.headfirst.simplefactory.Pizzas.Pizza;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;

public class SimplePizzaFactory {

	public Pizza createPizza(PizzaStyle pizzaStyle) {
		Pizza pizza = null;

		if (PizzaStyle.Cheeze == pizzaStyle) {
			pizza = new CheezePizza();
		} else if (PizzaStyle.Greek == pizzaStyle) {
			pizza = new GreekPizza();
		} else if (PizzaStyle.Pepperroni == pizzaStyle) {
			pizza = new PepperroniPizza();
		} else {
			pizza = new Pizza();
		}
		return pizza;
	}

}
