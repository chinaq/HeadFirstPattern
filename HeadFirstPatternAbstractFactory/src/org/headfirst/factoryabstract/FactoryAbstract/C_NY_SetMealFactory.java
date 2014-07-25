package org.headfirst.factoryabstract.FactoryAbstract;

import org.headfirst.factoryabstract.Breads.Bread;
import org.headfirst.factoryabstract.Breads.FrenchBread;
import org.headfirst.factoryabstract.Drinks.Beer;
import org.headfirst.factoryabstract.Drinks.Drink;
import org.headfirst.factoryabstract.Pizzas.NYPepperroniPizza;
import org.headfirst.factoryabstract.Pizzas.Pizza;

public class C_NY_SetMealFactory extends AbstractFactory {

	@Override
	public Pizza createPizza() {
		return new NYPepperroniPizza();
	}

	@Override
	public Drink createDrink() {
		return new Beer();
	}

	@Override
	public Bread createBread() {
		return new FrenchBread();
	}
}
