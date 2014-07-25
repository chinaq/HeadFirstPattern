package org.headfirst.factoryabstract.PizzaStores;

import org.headfirst.factoryabstract.SetMeals.SetMeal;
import org.headfirst.factoryabstract.SetMeals.SetMealStyle;

public abstract class PizzaStore {

	abstract SetMeal createSetMeal(SetMealStyle setMealStyle);

	//�����ײͺ������
	public SetMeal orderSetMeal(SetMealStyle setMealStyle) {
		SetMeal setMeal;
		System.out.println("orderred a set meal: " + setMealStyle.toString());

		setMeal = createSetMeal(setMealStyle);	//�����ײ��ڵ��������ݣ�pizza��drink��bread��
		setMeal.prepare();			//׼�����
		setMeal.box();				//������

		System.out.println("give you a set meal");
		return setMeal;
	}
}
