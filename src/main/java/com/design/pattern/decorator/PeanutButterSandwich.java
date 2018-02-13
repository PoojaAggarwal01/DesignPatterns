package com.design.pattern.decorator;

public class PeanutButterSandwich implements SandwichDecorator{
	Sandwich sandwich;

	public PeanutButterSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	public double cost() {
		return sandwich.cost() + 20.0;
	}

	public String description() {
		return sandwich.description()+" Peanut Butter";
	}

}
