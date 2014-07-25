package org.headfirst.factoryabstract;

import org.headfirst.factoryabstract.PizzaStores.ChicagoStylePizzaStore;
import org.headfirst.factoryabstract.PizzaStores.NYStylePizzaStore;
import org.headfirst.factoryabstract.PizzaStores.PizzaStore;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;

/**
 * 我们有两家pizza店， 先创建了一家NY pizza店 ，NY有多种套餐可选（里面有不同的pizza，drink，bread），
 * 首先NY店指定了本店内包含的哪几种套餐（FactorySetMeal_NY_Class），
 * 客户可以选择其中一种套餐（SetMeal），
 * 每个套餐（SetMeal）对应一种方案（既一个抽象工厂子类，例如：A_NY_SetMealFactory），
 * 方案（抽象工厂子类）生产各个具体产品（包括pizza，drink，bread），然后 返回给套餐，
 * 商店拿走套餐，处理后给客户，
 * 商店不需要知道具体会得到怎样的套餐，流程（打包、送货）都是一样的 ，这样就省心了哦
 **/

public class SimulateOrder {
	public static void main(String[] args) {
		PizzaStore NYPizzaStore = new NYStylePizzaStore();
		NYPizzaStore.orderSetMeal(SetMealStyle.A);

		 System.out.println("---------------------");
		
		 PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		 chicagoPizzaStore.orderSetMeal(SetMealStyle.B);
	}
}
