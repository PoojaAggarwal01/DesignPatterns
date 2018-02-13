package com.design.pattern.observer;

public class CurrentWeatherReport implements Observer{

	private WeatherData weatherData;
	
	public CurrentWeatherReport(WeatherData weatherData)
	{
		this.weatherData=weatherData;
		weatherData.addObserver(this);
	}
	
	public void update(WeatherData weatherData) {
		this.weatherData=weatherData;
		display();
	}

	public void display()
	{
		System.out.println("Today's weather report:");
		System.out.println("Temperature: "+this.weatherData.getTemperature());
		System.out.println("Humidity: "+this.weatherData.getHumidity());
		System.out.println("Pressure: "+this.weatherData.getPressure());
		
	}
}
