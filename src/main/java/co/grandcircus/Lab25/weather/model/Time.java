package co.grandcircus.Lab25.weather.model;

import java.util.List;

public class Time {
	
	private String layoutKey;
	private List<String> startPeriodName;
	private List<String> startValidTime; //Again, not messing with date objects for now
	private List<String> tempLabel;
	
	public String getLayoutKey() {
		return layoutKey;
	}
	public void setLayoutKey(String layoutKey) {
		this.layoutKey = layoutKey;
	}
	public List<String> getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public List<String> getStartValidTime() {
		return startValidTime;
	}
	public void setStartValidTime(List<String> startValidTime) {
		this.startValidTime = startValidTime;
	}
	public List<String> getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(List<String> tempLabel) {
		this.tempLabel = tempLabel;
	}
	
	@Override
	public String toString() {
		return "Time [layoutKey=" + layoutKey + ", startPeriodName=" + startPeriodName + 
			", startValidTime=" + startValidTime + "tempLabel=" + tempLabel + "]";
	}

}
