package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherData(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		if (observers != null && observers.size() >= 1 && observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(this);
		}

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
		this.temperature=weatherData.getTemperature();
		this.pressure=weatherData.getPressure();
		this.humidity=weatherData.getHumidity();
		notifyObserver();

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

}
