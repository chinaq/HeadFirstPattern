package org.headfirst.simplefactory.PizzaStores;

import org.headfirst.simplefactory.Pizzas.Pizza;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;
import org.headfirst.simplefactory.SimpleFactorys.NYPizzaFactory;

public class NYStylePizzaStore extends PizzaStore {

	public NYStylePizzaStore(){
		System.out.println("new a NY pizza store");
	}
	
	@Override
	Pizza createPizza(PizzaStyle pizzaStyle) {
		NYPizzaFactory factory = new NYPizzaFactory();
		return factory.createPizza(pizzaStyle);
	}
}
