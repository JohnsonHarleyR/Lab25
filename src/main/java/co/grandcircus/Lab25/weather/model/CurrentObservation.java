package co.grandcircus.Lab25.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {

	private String id;
	private String name;
	private String elev; //changing these all back to string to make sure it works
	private String latitude;
	private String longitude;
	@JsonProperty("Date")
	private String date; //not gonna mess with localdate til I understand it better
	@JsonProperty("Temp")
	private String temp;
	@JsonProperty("Dewp")
	private String dewP;
	@JsonProperty("Relh")
	private String relH;
	@JsonProperty("Winds") //changed these from int back to string just in case
	private String winds;    
	@JsonProperty("Windd")
	private String windD; 
	@JsonProperty("Gust") 
	private String gust;
	@JsonProperty("Weather")
	private String weather;
	@JsonProperty("Weatherimage")
	private String weatherImage;
	@JsonProperty("Visibility")
	private String visibility;
	@JsonProperty("Altimeter")
	private String altimeter;
	@JsonProperty("SLP")
	private String sLP;
	@JsonProperty("timezone")
	private String timeZone;
	private String state;
	@JsonProperty("WindChill")
	private String windChill;
	
	
	
	



	public String getId() {
		return id;
	}







	public void setId(String id) {
		this.id = id;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getElev() {
		return elev;
	}







	public void setElev(String elev) {
		this.elev = elev;
	}







	public String getLatitude() {
		return latitude;
	}







	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}







	public String getLongitude() {
		return longitude;
	}







	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}







	public String getDate() {
		return date;
	}







	public void setDate(String date) {
		this.date = date;
	}







	public String getTemp() {
		return temp;
	}







	public void setTemp(String temp) {
		this.temp = temp;
	}







	public String getDewP() {
		return dewP;
	}







	public void setDewP(String dewP) {
		this.dewP = dewP;
	}







	public String getRelH() {
		return relH;
	}







	public void setRelH(String relH) {
		this.relH = relH;
	}







	public String getWinds() {
		return winds;
	}







	public void setWinds(String winds) {
		this.winds = winds;
	}







	public String getWindD() {
		return windD;
	}







	public void setWindD(String windD) {
		this.windD = windD;
	}







	public String getGust() {
		return gust;
	}







	public void setGust(String gust) {
		this.gust = gust;
	}







	public String getWeather() {
		return weather;
	}







	public void setWeather(String weather) {
		this.weather = weather;
	}







	public String getWeatherImage() {
		return weatherImage;
	}







	public void setWeatherImage(String weatherImage) {
		this.weatherImage = weatherImage;
	}







	public String getVisibility() {
		return visibility;
	}







	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}







	public String getAltimeter() {
		return altimeter;
	}







	public void setAltimeter(String altimeter) {
		this.altimeter = altimeter;
	}







	public String getsLP() {
		return sLP;
	}







	public void setsLP(String sLP) {
		this.sLP = sLP;
	}







	public String getTimeZone() {
		return timeZone;
	}







	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}







	public String getState() {
		return state;
	}







	public void setState(String state) {
		this.state = state;
	}







	public String getWindChill() {
		return windChill;
	}







	public void setWindChill(String windChill) {
		this.windChill = windChill;
	}







	@Override
	public String toString() {
		return "CurrentObservation [id=" + id + ", name=" + name + 
			", elev=" + elev + ", latitude=" + latitude + 
			", longitude=" + longitude + ", date=" + date + 
			", temp=" + temp + ", dewP=" + dewP + 
			", relH=" + relH + ", winds=" + winds + 
			", windD=" + windD + ", gust=" + gust + 
			", weather=" + weather + ", weatherImage=" + weatherImage + 
			", visibility=" + visibility + ", altimeter=" + altimeter + 
			", sLP=" + sLP + ", timeZone=" + timeZone + 
			", state=" + state + "windChill=" + windChill + "]";
	}
	
}
