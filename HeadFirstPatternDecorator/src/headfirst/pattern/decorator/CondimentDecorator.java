package headfirst.pattern.decorator;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;
	
	
	public CondimentDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	
	
	@Override 
	public abstract String getDescription();
	
	
	@Override
	public void setSize(CupSize cupSize){
		beverage.setSize(cupSize);
	}
	
	
	@Override
	public CupSize getSize() {
		return beverage.getSize();
	}
}
