package org.headfirst.duck;

public class DuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		simulate(mallardDuck);
	}

	void simulate(Quackable quackable) {
		quackable.quack();
	}

}
