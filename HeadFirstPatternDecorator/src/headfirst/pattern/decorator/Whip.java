package headfirst.pattern.decorator;

public class Whip extends CondimentDecorator {
	
	
	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", "
				+ this.getClass().getSimpleName();
	}

}
