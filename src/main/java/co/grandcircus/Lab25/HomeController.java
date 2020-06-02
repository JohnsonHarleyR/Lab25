package co.grandcircus.Lab25;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.Lab25.Service.WeatherApiService;
import co.grandcircus.Lab25.weather.model.CurrentObservation;
import co.grandcircus.Lab25.weather.model.DailyForecast;
import co.grandcircus.Lab25.weather.model.Time;

@Controller
public class HomeController {
	
	//lots of unnecessary code as I was figuring all this out lol
	
	/*
	final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday"};*/
	@Autowired
	WeatherApiService service;
	
	//Get corresponding day - 0-6
	/*public int getDayNum(String day) {
		int dayNum = -1;
		
		for (int i = 0; i < DAYS.length; i++) {
			if (day.equalsIgnoreCase(DAYS[i])) {
				dayNum = i;
			}
		}
		return dayNum;
	}
	
	//To create list starting with today
	public String[] genDays(int today) {
		
		int nextDay = today + 2;
		String[] days = new String[7];
		
		days[0] = "Today";
		
		//adds the next day to list. Starts at 0 or 1
		//once it goes past Saturday
		for (int i = 1; i < 7; i++) {
			if (nextDay == 7) {
				nextDay = 0;
			}
			
			days[i] = DAYS[nextDay];
			nextDay++;
		}
		
		//return
		return days;
	}*/
	

	@RequestMapping("/")
	public String home(
			
			Model model) {
		
		//putting it here to get custom lat and lon
		//service.setLat(lat);
		//service.setLon(lon);
		
		String newDate;
		
		CurrentObservation currentObservation = service.getCurrentObservation();
		
		
		//Get lists - I'm understanding it now yay
		List<String> startPeriodNames = service.getTime().getStartPeriodName();
		List<String> iconLinks = service.getData().getIconLink();
		List<Integer> temperatures = service.getData().getTemperature();
		List<String> weathers = service.getData().getWeather(); //I know this isn't a word
		List<String> tempLabels = service.getTime().getTempLabel();
		List<String> texts = service.getData().getText();
		List<DailyForecast> forecasts = new ArrayList<>();
		
		
		//Put daily forecasts into list
		for (int i = 0; i < startPeriodNames.size(); i++) {
			forecasts.add(new DailyForecast(startPeriodNames.get(i),
					iconLinks.get(i), temperatures.get(i), weathers.get(i),
					tempLabels.get(i), texts.get(i)));
		}
		
		
		//Get location from lat and lon, turn it into a string
		String location = currentObservation.getName() + ", "
				+ currentObservation.getState();
		
		//Get today's date and time
		LocalDateTime now = LocalDateTime.now();  
		
		//Format date for display - I'm sure there's some easier way
		String month = now.getMonth().toString();
		int dayOfMonth = now.getDayOfMonth();
		int year = now.getYear();
		String today = now.getDayOfWeek().toString();
		//int todayNum = getDayNum(today);
		//fix month appearance
		month = month.toLowerCase();
		today = today.toLowerCase();
		month = month.substring(0, 1).toUpperCase() + month.substring(1);
		today = today.substring(0, 1).toUpperCase() + today.substring(1);
		//format
		newDate = "Today is " + today + "<br>" + month + " " + dayOfMonth + ", " + year;
		
		//create week starting with today
		//String[] custDays = genDays(todayNum); //change variable in genDays
		
		//change to custom days once that's done
		//model.addAttribute("days", custDays);
		model.addAttribute("now", newDate);
		model.addAttribute("observation", currentObservation);
		model.addAttribute("location", location);
		//model.addAttribute("date", date);
		
		return "/index";
	}
	
}
