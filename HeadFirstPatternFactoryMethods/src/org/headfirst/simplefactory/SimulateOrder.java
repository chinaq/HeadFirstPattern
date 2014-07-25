package org.headfirst.simplefactory;

import org.headfirst.simplefactory.PizzaStores.ChicagoStylePizzaStore;
import org.headfirst.simplefactory.PizzaStores.NYStylePizzaStore;
import org.headfirst.simplefactory.PizzaStores.PizzaStore;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;

/**
 * 我们有两家pizza店，
 * 先创建了一家NY pizza店
 * NY根据用户的要求制作不同的pizza， 
 * 店里用了一个“工厂方法”来根据用户的要求，制作出特定的pizza，
 * 我把要求给“工厂方法”，然后我就不管了， 具体“简单工厂”制作的是哪一款pizza，店里面不需要知道，
 * 反正对店里而言无论什么pizza，我要做的是切块、包装等，这些流程都是一样的 这样我就省心了哦
 */

public class SimulateOrder {
	public static void main(String[] args) {
		PizzaStore NYPizzaStore = new NYStylePizzaStore();
		NYPizzaStore.orderPizza(PizzaStyle.Greek);

		System.out.println("---------------------");

		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza(PizzaStyle.Pepperroni);
	}
}
