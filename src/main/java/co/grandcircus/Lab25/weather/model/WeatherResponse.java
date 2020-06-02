package co.grandcircus.Lab25.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
	
	//I guess I should actually ask you guys if this will automatically
	//convert dates into LocalDate or DateTime?
	//(until then I'm sticking to strings, I don't trust date objects anymore lol)
	
	//Another question to ask: How do I make "print" show up on the console? When I do
	//it for testing, I don't see it show up down there
	
	private String operationalMode;
	private String srsName;
	private String creationDate;
	private String creationDateLocal;
	private String productionCenter;
	private String credit;
	private String moreinformation;
	private Location location;
	private Time time;
	private Data data;
	@JsonProperty("currentobservation")
	private CurrentObservation currentObservation;
	
	
	public String getOperationalMode() {
		return operationalMode;
	}
	public void setOperationalMode(String operationalMode) {
		this.operationalMode = operationalMode;
	}
	public String getSrsName() {
		return srsName;
	}
	public void setSrsName(String srsName) {
		this.srsName = srsName;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreationDateLocal() {
		return creationDateLocal;
	}
	public void setCreationDateLocal(String creationDateLocal) {
		this.creationDateLocal = creationDateLocal;
	}
	public String getProductionCenter() {
		return productionCenter;
	}
	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getMoreinformation() {
		return moreinformation;
	}
	public void setMoreinformation(String moreinformation) {
		this.moreinformation = moreinformation;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
	
	//Note to self: Create a program that generates the toString FOR me
	//I'm not gonna worry about toString for right now
	
	//Well, I went and did it
	@Override
	public String toString() {
		return "WeatherResponse [operationalMode=" + operationalMode + ", srsName=" + srsName + 
			", creationDate=" + creationDate + ", creationDateLocal=" + creationDateLocal + 
			", productionCenter=" + productionCenter + ", credit=" + credit + 
			", moreinformation=" + moreinformation + ", location=" + location + 
			", time=" + time + ", data=" + data + 
			"currentObservation=" + currentObservation + "]";
	}
	

}
