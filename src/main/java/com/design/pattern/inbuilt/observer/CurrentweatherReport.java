package com.design.pattern.inbuilt.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentweatherReport implements Observer {

	private Observable weatherData;

	public CurrentweatherReport(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			weatherData = (WeatherData) o;
			display();
		}
	}
	
	public void display()
	{
		System.out.println("Today's weather report:");
		System.out.println("Temperature: "+((WeatherData) this.weatherData).getTemperature());
		System.out.println("Humidity: "+((WeatherData) this.weatherData).getHumidity());
		System.out.println("Pressure: "+((WeatherData) this.weatherData).getPressure());
		
	}

}
