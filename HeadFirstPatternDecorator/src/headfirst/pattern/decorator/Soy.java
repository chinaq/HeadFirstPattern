package headfirst.pattern.decorator;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}


	@Override
	public String getDescription() {
		return beverage.getDescription() + ", "
				+ this.getClass().getSimpleName();
	}

	
	@Override
	public double cost() {
		return 0.3 + beverage.cost();
	}

}
