package com.example.webservice.model;

import java.util.List;

public class PracticeUserDetails {
	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	private String password;
	private List<AddressDetails> address;
	private List<JourneyDetails> journies;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<AddressDetails> getAddress() {
		return address;
	}
	public void setAddress(List<AddressDetails> address) {
		this.address = address;
	}
	public List<JourneyDetails> getJournies() {
		return journies;
	}
	public void setJournies(List<JourneyDetails> journies) {
		this.journies = journies;
	}
	
}
