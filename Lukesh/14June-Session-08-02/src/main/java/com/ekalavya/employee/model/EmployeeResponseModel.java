package com.ekalavya.employee.model;

public class EmployeeResponseModel {

	private String employeeReferenceNumber;
	private String employeeName;
	private String address;
	private String city;
	private String state;
	private String mobileNumber;
	private String emailId;
	
	
	
	public EmployeeResponseModel() {
		super();
	}

	public EmployeeResponseModel(String employeeReferenceNumber, String employeeName, String address, String city,
			String state, String mobileNumber, String emailId) {
		super();
		this.employeeReferenceNumber = employeeReferenceNumber;
		this.employeeName = employeeName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
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
		return "EmployeeResponseModel [employeeReferenceNumber=" + employeeReferenceNumber + ", employeeName="
				+ employeeName + ", address=" + address + ", city=" + city + ", state=" + state + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + "]";
	}
	
	
	


}
