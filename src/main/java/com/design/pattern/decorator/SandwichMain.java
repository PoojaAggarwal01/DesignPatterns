package com.design.pattern.decorator;

public class SandwichMain {

	public static void main(String[] args) {

		
		Sandwich sandwich1=new WhiteBreadSandwich();
		sandwich1=new CheeseSandwich(sandwich1);
		System.out.println(sandwich1.description()+"  "+sandwich1.cost());
		
		Sandwich sandwich2=new BrownBreadSandwich();
		sandwich2=new PeanutButterSandwich(sandwich2);
		System.out.println(sandwich2.description()+"  "+sandwich2.cost());
		
		Sandwich sandwich3=new BrownBreadSandwich();
		sandwich3=new PeanutButterSandwich(sandwich3);
		sandwich3=new PeanutButterSandwich(sandwich3);
		System.out.println(sandwich3.description()+"  "+sandwich3.cost());
	}

}
