package org.headfirst.simplefactory.SimpleFactorys;

import org.headfirst.simplefactory.Pizzas.ChicagoCheezePizza;
import org.headfirst.simplefactory.Pizzas.ChicagoGreekPizza;
import org.headfirst.simplefactory.Pizzas.ChicagoPepperroniPizza;
import org.headfirst.simplefactory.Pizzas.Pizza;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;
import org.headfirst.simplefactory.Pizzas.UnknownPizza;

public class ChicagoPizzaFactory {

	public Pizza createPizza(PizzaStyle pizzaStyle) {
		Pizza pizza = null;

		if (PizzaStyle.Cheeze == pizzaStyle) {
			pizza = new ChicagoCheezePizza();
		} else if (PizzaStyle.Greek == pizzaStyle) {
			pizza = new ChicagoGreekPizza();
		} else if (PizzaStyle.Pepperroni == pizzaStyle) {
			pizza = new ChicagoPepperroniPizza();
		} else {
			pizza = new UnknownPizza();
		}
		return pizza;
	}

}
