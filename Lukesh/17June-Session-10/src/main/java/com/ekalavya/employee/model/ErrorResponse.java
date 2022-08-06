package com.ekalavya.employee.model;

public class ErrorResponse {

	private String errorMessage;

	private String timeStamp;

	private String httpStatusCode;
	
	private String errorCode;
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "ErrorResponse [errorMessage=" + errorMessage + ", timeStamp=" + timeStamp + ", httpStatusCode="
				+ httpStatusCode + ", errorCode=" + errorCode + "]";
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

}
