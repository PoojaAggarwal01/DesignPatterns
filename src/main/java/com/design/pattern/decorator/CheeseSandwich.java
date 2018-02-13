package com.design.pattern.decorator;

public class CheeseSandwich implements SandwichDecorator {

	Sandwich sandwich;

	public CheeseSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	public double cost() {
		return sandwich.cost() + 10.0;
	}


	public String description() {
		return sandwich.description()+" Cheese";
	}

}
