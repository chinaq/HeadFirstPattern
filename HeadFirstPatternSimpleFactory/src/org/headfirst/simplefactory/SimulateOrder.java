package org.headfirst.simplefactory;

import org.headfirst.simplefactory.PizzaStores.PizzaStore;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;
import org.headfirst.simplefactory.SimpleFactorys.SimplePizzaFactory;


/**
 * 我们有一家pizza店，根据用户的要求制作不同的pizza，
 * 店里用了一个“简单工厂”来根据用户的要求，制作出特定的pizza，
 * 我把要求给“简单工厂”，然后我就不管了，
 * 具体“简单工厂”制作的是哪一款pizza，店里面不需要知道，
 * 反正对店里而言无论什么pizza，我要做的是切块、包装等，这些流程都是一样的
 * 这样我就省心了哦 
 */


public class SimulateOrder {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		pizzaStore.orderPizza(PizzaStyle.Greek);
	}
}
