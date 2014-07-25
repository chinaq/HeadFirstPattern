package headfirst.pattern.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = this.getClass().getSimpleName();
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
