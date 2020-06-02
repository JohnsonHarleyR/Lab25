package co.grandcircus.Lab25.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	
	private String region;
	private double latitude;
	private double longitude;
	private int elevation;
	private String wfo;
	@JsonProperty("timezone") //I did this way in another class
	private String timeZone; //let's be consistent
	private String areaDescription;
	private String radar;
	private String zone;
	private String county;
	private String firezone;
	private String metar;
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getElevation() {
		return elevation;
	}
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}
	public String getWfo() {
		return wfo;
	}
	public void setWfo(String wfo) {
		this.wfo = wfo;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getAreaDescription() {
		return areaDescription;
	}
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
	public String getRadar() {
		return radar;
	}
	public void setRadar(String radar) {
		this.radar = radar;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getFirezone() {
		return firezone;
	}
	public void setFirezone(String firezone) {
		this.firezone = firezone;
	}
	public String getMetar() {
		return metar;
	}
	public void setMetar(String metar) {
		this.metar = metar;
	}
	
	@Override
	public String toString() {
		return "Location [region=" + region + ", latitude=" + latitude + 
			", longitude=" + longitude + ", elevation=" + elevation + 
			", wfo=" + wfo + ", timeZone=" + timeZone + 
			", areaDescription=" + areaDescription + ", radar=" + radar + 
			", zone=" + zone + ", county=" + county + 
			", firezone=" + firezone + "metar=" + metar + "]";
	}

}
