package headfirst.pattern.decorator;

public class Mocha extends CondimentDecorator {
	
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	
	public String getDescription() {
		return beverage.getDescription() + ", "
				+ this.getClass().getSimpleName();
	}
	

	

	@Override
	public double cost() {
		CupSize cupSize = beverage.getSize();
		double cost = beverage.cost();
		switch(cupSize){
			case TALL:
				cost += 0.1;
				break;
			case GRANDE:
				cost += 0.15;
				break;
			case VENTI:
				cost += 0.2;
				break;
			default:
				throw new RuntimeException("Unknown CupSize");
		}
		return cost;
	}


}
