package headfirst.pattern.decorator;

import headfirst.pattern.decorator.Beverage.CupSize;

public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		printBeverage(beverage);

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		printBeverage(beverage2);

		System.out.println();
		System.out.println("-----------setSize-------------");

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(CupSize.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);	
		printBeverage(beverage3);		
		
		beverage3.setSize(CupSize.TALL);
		printBeverage(beverage3);
	}

	
	
	private static void printBeverage(Beverage beverage) {
		System.out.println(beverage.getDescription() 
				+ " $" + String.format("%.2f",beverage.cost()));
	}

}
