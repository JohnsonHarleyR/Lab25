package co.grandcircus.Lab25.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.Lab25.weather.model.CurrentObservation;
import co.grandcircus.Lab25.weather.model.Data;
import co.grandcircus.Lab25.weather.model.Location;
import co.grandcircus.Lab25.weather.model.Time;
import co.grandcircus.Lab25.weather.model.WeatherResponse;

@Service
public class WeatherApiService {
	
	//change these so they match user's location
	private double lat = 43.001438;
	private double lon = -84.558502;
	String url = 
	"https://forecast.weather.gov/MapClick.php?lat={lat}&lon={lon}&FcstType=json";
	
	private RestTemplate rest = new RestTemplate();
	
	/*public WeatherApiService(double lon, double lat) {
		this.lon = lon;
		this.lat = lat;
	}*/
	
	public WeatherApiService() {}
	
	public WeatherApiService(double lat, double lon) {
		this.lat = lat;
		this.lon = lon;
	}
	
	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Data getData() {
		WeatherResponse response = rest.getForObject(url, WeatherResponse.class,
				lat, lon);
		
		return response.getData();
	}
	
	public Location getLocation() {
		WeatherResponse response = rest.getForObject(url, WeatherResponse.class,
				lat, lon);
		
		return response.getLocation();
	}
	
	public CurrentObservation getCurrentObservation() {
		WeatherResponse response = rest.getForObject(url, WeatherResponse.class,
				lat, lon);
		
		return response.getCurrentObservation();
	}
	
	public Time getTime() {
		WeatherResponse response = rest.getForObject(url, WeatherResponse.class,
				lat, lon);
		
		return response.getTime();
	}

}
