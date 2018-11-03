package com.example.webservice.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.webservice.dto.PracticeUserDto;

public class JourneyDetails {
	

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
public void setTrainName(String trainName) {
	this.trainName = trainName;
}



}
