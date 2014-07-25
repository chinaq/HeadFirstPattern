package org.headfirst.simplefactory;

import org.headfirst.simplefactory.PizzaStores.ChicagoStylePizzaStore;
import org.headfirst.simplefactory.PizzaStores.NYStylePizzaStore;
import org.headfirst.simplefactory.PizzaStores.PizzaStore;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;

/**
 * ����������pizza�꣬
 * �ȴ�����һ��NY pizza��
 * NY�����û���Ҫ��������ͬ��pizza�� 
 * ��������һ���������������������û���Ҫ���������ض���pizza��
 * �Ұ�Ҫ�����������������Ȼ���ҾͲ����ˣ� ���塰�򵥹���������������һ��pizza�������治��Ҫ֪����
 * �����Ե����������ʲôpizza����Ҫ�������п顢��װ�ȣ���Щ���̶���һ���� �����Ҿ�ʡ����Ŷ
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
