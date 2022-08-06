package com.ekalavya.employee.model;

public class EmployeeRequestModel {
	
	   private String 	firstName;
	   private String 	lastName;
	   private String 	address;
	   private String 	city;
	   private String 	state;
	   private String 	mobileNumber;
	   private String 	emailId;
	   
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "EmployeeRequestModel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ "]";
	}
	public EmployeeRequestModel(String firstName, String lastName, String address, String city, String state,
			String mobileNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	   
}
