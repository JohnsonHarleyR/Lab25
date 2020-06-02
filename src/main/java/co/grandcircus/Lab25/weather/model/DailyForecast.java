package co.grandcircus.Lab25.weather.model;

import co.grandcircus.Lab25.Service.WeatherApiService;

public class DailyForecast {
	
	private WeatherApiService service;
	private Time time;
	private Data data;
	private CurrentObservation currentObservation;
	
	private String iconUrl;
	private String temperature;
	private String weather;
	private String period;
	private String tempLabel;
	private String mText;
	
	
	public DailyForecast(WeatherApiService service
			) {
		this.service = service;
		this.time = service.getTime();
		this.data = service.getData();
		this.currentObservation = service.getCurrentObservation();
	}
	

}
