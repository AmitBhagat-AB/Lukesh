package com.ekalavya.employee.model;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeRequestModel {
	
	@NotNull(message = "FirstName should not be null")
	private String firstName;

	private String lastName;

	@NotNull(message = "address should not be null")
	private String address;

	@NotNull(message = "city should not be null")
	private String city;

	private String state;

	@NotNull(message = "mob No should not be null")
	@Pattern(regexp = "^[0-9]{10}$")
//	@Pattern(regexp = "/^([+]\\d{2}[ ])?\\d{10}$/")
	private String mobileNumber;

	@NotNull(message = "email Id should not be null")
	@Email(message = "email should be valid email id")
	private String emailId;

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
	
}
/*
 * private String firstName; private String lastName; private String address;
 * private String city; private String state; private String mobileNumber;
 * private String emailId;
 */