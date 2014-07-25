package org.headfirst.simplefactory.SimpleFactorys;

import org.headfirst.simplefactory.Pizzas.NYCheezePizza;
import org.headfirst.simplefactory.Pizzas.NYGreekPizza;
import org.headfirst.simplefactory.Pizzas.NYPepperroniPizza;
import org.headfirst.simplefactory.Pizzas.Pizza;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;
import org.headfirst.simplefactory.Pizzas.UnknownPizza;

public class NYPizzaFactory {

	public Pizza createPizza(PizzaStyle pizzaStyle) {
		Pizza pizza = null;

		if (PizzaStyle.Cheeze == pizzaStyle) {
			pizza = new NYCheezePizza();
		} else if (PizzaStyle.Greek == pizzaStyle) {
			pizza = new NYGreekPizza();
		} else if (PizzaStyle.Pepperroni == pizzaStyle) {
			pizza = new NYPepperroniPizza();
		} else {
			pizza = new UnknownPizza();
		}
		return pizza;
	}

}
