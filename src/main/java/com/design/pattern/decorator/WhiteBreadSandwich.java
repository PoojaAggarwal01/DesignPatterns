package com.design.pattern.decorator;

public class WhiteBreadSandwich implements Sandwich{

	public double cost() {
		return 20.0;
	}
	public String description()
	{
		return "White Bread Sandwich";
	}
}
