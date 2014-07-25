package org.headfirst.factoryabstract.FactoryAbstract;

import org.headfirst.factoryabstract.Breads.Bread;
import org.headfirst.factoryabstract.Drinks.Drink;
import org.headfirst.factoryabstract.Pizzas.Pizza;

public abstract class AbstractFactory {

	public abstract Pizza createPizza();
	public abstract Drink createDrink();
	public abstract Bread createBread();	
	
}
