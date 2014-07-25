package headfirst.pattern.decorator;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	private CupSize size = CupSize.TALL;
	
	public CupSize getSize() {
		return size;
	}

	public void setSize(CupSize size) {
		this.size = size;
	}

	enum CupSize {
		TALL, GRANDE, VENTI
	}



	public String getDescription() {
		return description 
				+ " " + size.toString().toLowerCase();
	}

	public abstract double cost();
}
