package co.grandcircus.Lab25.weather.model;

import java.util.List;

public class Data {
	
	private List<String> text;
	private List<String> hazardUrl;
	private List<String> hazard;
	private List<String> iconLink;
	private List<String> weather;
	private List<Integer> pop; //some values say "null" but apparently you can put those in a list
	private List<Integer> temperature;
	
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}
	public List<String> getHazardUrl() {
		return hazardUrl;
	}
	public void setHazardUrl(List<String> hazardUrl) {
		this.hazardUrl = hazardUrl;
	}
	public List<String> getHazard() {
		return hazard;
	}
	public void setHazard(List<String> hazard) {
		this.hazard = hazard;
	}
	public List<String> getIconLink() {
		return iconLink;
	}
	public void setIconLink(List<String> iconLink) {
		this.iconLink = iconLink;
	}
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	public List<Integer> getPop() {
		return pop;
	}
	public void setPop(List<Integer> pop) {
		this.pop = pop;
	}
	public List<Integer> getTemperature() {
		return temperature;
	}
	public void setTemperature(List<Integer> temperature) {
		this.temperature = temperature;
	}
	
	@Override
	public String toString() {
		return "Data [text=" + text + ", hazardUrl=" + hazardUrl + 
			", hazard=" + hazard + ", iconLink=" + iconLink + 
			", weather=" + weather + ", pop=" + pop + 
			"temperature=" + temperature + "]";
	}


}
