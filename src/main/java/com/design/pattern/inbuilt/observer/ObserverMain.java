package com.design.pattern.inbuilt.observer;


public class ObserverMain {

	public static void main(String[] args) {
		WeatherData sub=new WeatherData(10.0, 10.0, 18.0);
		CurrentweatherReport ob=new CurrentweatherReport( sub);
		sub.setHumidity(11.0);
		sub.setParameters(sub);
		
		sub.deleteObserver(ob);
		sub.setPressure(15.0);
		sub.setParameters(sub);
	}
}
