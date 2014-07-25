package headfirst.pattern.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
