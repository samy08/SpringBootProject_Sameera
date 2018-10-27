package com.example.webservice.response;

import java.util.List;

import com.example.webservice.model.AddressDetails;
import com.example.webservice.model.JourneyDetails;

public class PracticeUserResponse {
	private String firstName;
	private String lastName;
	private String email;
	private List<AddressDetails> address;
	private List<JourneyDetails> journies;
	
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
	@Override
	public String toString() {
		return "PracticeUserResponse [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", journies=" + journies + "]";
	}
	
}
