package com.example.webservice.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;





@Entity(name="PracticeUser")
public class PracticeUserDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -750048758676626437L;
	@Id
	@GeneratedValue
	private long id;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(nullable=false,length=50)
	private String firstName;
	@Column(nullable=false,length=50)
	private String lastName;
	@Column(nullable=false,length=120)
	private String email;
	@Column(nullable=false,length=50)
	private String password;
	@Column(nullable=false)
	private String userId;
	
	@OneToMany(mappedBy="userDetals", cascade=CascadeType.ALL)
	private List<AddressDto> address;
	
	@OneToMany(mappedBy="userDetails",cascade=CascadeType.ALL)
	private List<JourneyDto> journies;
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId; 
	}
	public List<AddressDto> getAddress() {
		return address;
	}
	public void setAddress(List<AddressDto> address) {
		this.address = address;
	}
	public List<JourneyDto> getJournies() {
		return journies;
	}
	public void setJournies(List<JourneyDto> journies) {
		this.journies = journies;
	}
	@Override
	public String toString() {
		return "PracticeUserDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", userId=" + userId + ", address=" + address + ", journies=" + journies
				+ "]";
	}
	
	
}
