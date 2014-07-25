package org.headfirst.simplefactory;

import org.headfirst.simplefactory.PizzaStores.PizzaStore;
import org.headfirst.simplefactory.Pizzas.PizzaStyle;
import org.headfirst.simplefactory.SimpleFactorys.SimplePizzaFactory;


/**
 * ������һ��pizza�꣬�����û���Ҫ��������ͬ��pizza��
 * ��������һ�����򵥹������������û���Ҫ���������ض���pizza��
 * �Ұ�Ҫ������򵥹�������Ȼ���ҾͲ����ˣ�
 * ���塰�򵥹���������������һ��pizza�������治��Ҫ֪����
 * �����Ե����������ʲôpizza����Ҫ�������п顢��װ�ȣ���Щ���̶���һ����
 * �����Ҿ�ʡ����Ŷ 
 */


public class SimulateOrder {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		pizzaStore.orderPizza(PizzaStyle.Greek);
	}
}
