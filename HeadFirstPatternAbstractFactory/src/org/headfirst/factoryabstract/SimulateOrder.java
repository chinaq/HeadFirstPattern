package org.headfirst.factoryabstract;

import org.headfirst.factoryabstract.PizzaStores.ChicagoStylePizzaStore;
import org.headfirst.factoryabstract.PizzaStores.NYStylePizzaStore;
import org.headfirst.factoryabstract.PizzaStores.PizzaStore;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;

/**
 * ����������pizza�꣬ �ȴ�����һ��NY pizza�� ��NY�ж����ײͿ�ѡ�������в�ͬ��pizza��drink��bread����
 * ����NY��ָ���˱����ڰ������ļ����ײͣ�FactorySetMeal_NY_Class����
 * �ͻ�����ѡ������һ���ײͣ�SetMeal����
 * ÿ���ײͣ�SetMeal����Ӧһ�ַ�������һ�����󹤳����࣬���磺A_NY_SetMealFactory����
 * ���������󹤳����ࣩ�������������Ʒ������pizza��drink��bread����Ȼ�� ���ظ��ײͣ�
 * �̵������ײͣ��������ͻ���
 * �̵겻��Ҫ֪�������õ��������ײͣ����̣�������ͻ�������һ���� ��������ʡ����Ŷ
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
