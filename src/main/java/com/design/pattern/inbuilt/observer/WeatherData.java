package com.design.pattern.inbuilt.observer;

import java.util.ArrayList;
import java.util.Observable;

import com.design.pattern.observer.Observer;

public class WeatherData extends Observable {

	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setParameters(WeatherData weatherData) {

		this.temperature = weatherData.getTemperature();
		this.pressure = weatherData.getPressure();
		this.humidity = weatherData.getHumidity();
		setChanged();
		notifyObservers();

	}

}
