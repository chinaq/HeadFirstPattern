package org.headfirst.simplefactory.PizzaStores;

import org.headfirst.simplefactory.Pizzas.Pizza;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;
import org.headfirst.simplefactory.SimpleFactorys.ChicagoPizzaFactory;

public class ChicagoStylePizzaStore extends PizzaStore {

	public ChicagoStylePizzaStore(){
		System.out.println("new a Chicago pizza store");
	}
	
	@Override
	Pizza createPizza(PizzaStyle pizzaStyle) {
		ChicagoPizzaFactory factory = new ChicagoPizzaFactory();
		return factory.createPizza(pizzaStyle);
	}
}
