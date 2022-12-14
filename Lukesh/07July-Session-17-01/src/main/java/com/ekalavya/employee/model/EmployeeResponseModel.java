package com.ekalavya.employee.model;

public class EmployeeResponseModel {
	
private Integer employeeId;
	
	private String employeeReferenceNumber;

	private String employeeName;

	private String address;

	private String city;

	private String state;

	private String mobileNumber;

	private String emailId;
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeReferenceNumber() {
		return employeeReferenceNumber;
	}


	public void setEmployeeReferenceNumber(String employeeReferenceNumber) {
		this.employeeReferenceNumber = employeeReferenceNumber;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
		return "EmployeeResponseModel [employeeId=" + employeeId + ", employeeReferenceNumber="
				+ employeeReferenceNumber + ", employeeName=" + employeeName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}
	
	

}
