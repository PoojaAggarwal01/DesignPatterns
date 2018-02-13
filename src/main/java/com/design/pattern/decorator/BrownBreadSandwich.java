package com.design.pattern.decorator;

public class BrownBreadSandwich implements Sandwich{

	public double cost() {
		return 30.0;
	}
	public String description()
	{
		return "Brown Bread Sandwich";
	}
}
