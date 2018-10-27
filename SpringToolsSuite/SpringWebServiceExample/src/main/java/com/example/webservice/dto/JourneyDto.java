package com.example.webservice.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="JourneyList")
public class JourneyDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -983830348649093877L;
	
	@Id
	@GeneratedValue
	private long id;

	@Column(length=40)
	private String journeyDate;	
	
	@Column(length=40)
	private String trainNumber;
	
	@Column(length=100)
	private String trainName;
	
	@Column(length=100)
	private String fromPlace;
	
	@Column(length=100)
	private String toPlace;
	@ManyToOne
	@JoinColumn(name="PracticeUser_id")
	private PracticeUserDto userDetails;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public PracticeUserDto getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(PracticeUserDto userDetails) {
		this.userDetails = userDetails;
	}
	
	
	
	
	

	

}
