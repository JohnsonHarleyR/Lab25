package co.grandcircus.Lab25;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.Lab25.Service.WeatherApiService;
import co.grandcircus.Lab25.weather.model.CurrentObservation;

@Controller
public class HomeController {
	
	final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday"};
	@Autowired
	WeatherApiService service;
	
	//Get corresponding day - 0-6
	public int getDayNum(String day) {
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
	}
	

	@RequestMapping("/")
	public String home(
			
			Model model) {
		
		String newDate;
		
		CurrentObservation currentObservation = service.getCurrentObservation();
		
		//putting it here to get custom lat and lon
				//service.setLat(lat);
				//service.setLon(lon);
		
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
		int todayNum = getDayNum(today);
		//fix month appearance
		month = month.toLowerCase();
		today = today.toLowerCase();
		month = month.substring(0, 1).toUpperCase() + month.substring(1);
		today = today.substring(0, 1).toUpperCase() + today.substring(1);
		//format
		newDate = "Today is " + today + "<br>" + month + " " + dayOfMonth + ", " + year;
		
		//create week starting with today
		String[] custDays = genDays(todayNum); //change variable in genDays
		
		//change to custom days once that's done
		model.addAttribute("days", custDays);
		model.addAttribute("now", newDate);
		model.addAttribute("observation", currentObservation);
		model.addAttribute("location", location);
		//model.addAttribute("date", date);
		
		return "/index";
	}
	
}
