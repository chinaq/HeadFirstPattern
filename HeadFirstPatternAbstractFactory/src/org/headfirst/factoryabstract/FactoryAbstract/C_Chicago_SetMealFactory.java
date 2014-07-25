package org.headfirst.factoryabstract.FactoryAbstract;

import org.headfirst.factoryabstract.Breads.BlackBread;
import org.headfirst.factoryabstract.Breads.Bread;
import org.headfirst.factoryabstract.Drinks.Beer;
import org.headfirst.factoryabstract.Drinks.Drink;
import org.headfirst.factoryabstract.Pizzas.ChicagoPepperroniPizza;
import org.headfirst.factoryabstract.Pizzas.Pizza;

public class C_Chicago_SetMealFactory extends AbstractFactory {

	@Override
	public Pizza createPizza() {
		return new ChicagoPepperroniPizza();
	}

	@Override
	public Drink createDrink() {
		return new Beer();
	}

	@Override
	public Bread createBread() {
		return new BlackBread();
	}

}
