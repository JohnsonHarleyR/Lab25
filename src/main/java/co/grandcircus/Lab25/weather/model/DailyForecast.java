package co.grandcircus.Lab25.weather.model;

import co.grandcircus.Lab25.Service.WeatherApiService;

public class DailyForecast {
	
	private String startPeriodName;
	private String iconLink;
	private int temperature;
	private String weather;
	private String tempLabel;
	private String text;
	
	
	public DailyForecast(String startPeriodName, String iconLink, int temperature,
			String weather, String tempLabel, String text) {
		
		this.startPeriodName = startPeriodName;
		this.iconLink = iconLink;
		this.temperature = temperature;
		this.weather = weather;
		this.tempLabel = tempLabel;
		this.text = text;
		
	}


	public String getStartPeriodName() {
		return startPeriodName;
	}


	public void setStartPeriodName(String startPeriodName) {
		this.startPeriodName = startPeriodName;
	}


	public String getIconLink() {
		return iconLink;
	}


	public void setIconLink(String iconLink) {
		this.iconLink = iconLink;
	}


	public int getTemperature() {
		return temperature;
	}


	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	public String getWeather() {
		return weather;
	}


	public void setWeather(String weather) {
		this.weather = weather;
	}


	public String getTempLabel() {
		return tempLabel;
	}


	public void setTempLabel(String tempLabel) {
		this.tempLabel = tempLabel;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

}
