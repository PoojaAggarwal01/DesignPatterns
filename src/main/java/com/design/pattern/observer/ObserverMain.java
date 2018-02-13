package com.design.pattern.observer;

public class ObserverMain {

	public static void main(String[] args) {
		WeatherData sub=new WeatherData(10.0, 10.0, 18.0);
		CurrentWeatherReport ob=new CurrentWeatherReport((WeatherData) sub);
		sub.setHumidity(11.0);
		sub.setParameters(sub);
		
		sub.removeObserver(ob);
		sub.setPressure(15.0);
		sub.setParameters(sub);
	}
	
	
	
}
