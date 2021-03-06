package com.example.webservice.response;

import java.util.List;

import com.example.webservice.model.AddressDetails;
import com.example.webservice.model.JourneyDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class PracticeUserResponse {
	private String firstName;
	private String lastName;
	private String email;
	@JsonIgnore
	private long id;
	private List<AddressResponse> address;
	private List<JourneyResponse> journies;
	
	public List<AddressResponse> getAddress() {
		return address;
	}
	public void setAddress(List<AddressResponse> address) {
		this.address = address;
	}
	public List<JourneyResponse> getJournies() {
		return journies;
	}
	public void setJournies(List<JourneyResponse> journies) {
		this.journies = journies;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PracticeUserResponse [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address=" + address + ", journies=" + journies + "]";
	}
	
}
