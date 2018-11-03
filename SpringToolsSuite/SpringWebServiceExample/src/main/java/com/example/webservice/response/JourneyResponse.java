package com.example.webservice.response;

import javax.persistence.Column;

public class JourneyResponse {

	private String journeyDate;	

	private String trainNumber;
	

	private String trainName;
	

	private String fromPlace;
	
	
	private String toPlace;


	public String getJourneyDate() {
		return journeyDate;
	}


	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}


	public String getTrainNumber() {
		return trainNumber;
	}


	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}


	public String getTrainName() {
		return trainName;
	}


	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}


	public String getFromPlace() {
		return fromPlace;
	}


	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}


	public String getToPlace() {
		return toPlace;
	}


	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}


	@Override
	public String toString() {
		return "JourneyResponse [journeyDate=" + journeyDate + ", trainNumber=" + trainNumber + ", trainName="
				+ trainName + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + "]";
	}
	
	
}
