package com.data.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);

		weatherData.setMesurements(80, 65, 30.4f);
		weatherData.setMesurements(82, 85, 29.5f);
	}

}
