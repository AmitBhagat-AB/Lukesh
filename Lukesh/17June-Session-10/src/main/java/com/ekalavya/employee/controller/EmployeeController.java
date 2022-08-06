package com.ekalavya.employee.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekalavya.employee.constants.EmployeeConstants;
import com.ekalavya.employee.model.EmployeeRequestModel;
import com.ekalavya.employee.model.EmployeeResponseModel;
import com.ekalavya.employee.model.ErrorResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@PostMapping(value = "/save")
	public ResponseEntity<EmployeeResponseModel> createEmployee(@RequestBody EmployeeRequestModel request) {
		
		EmployeeResponseModel response = new EmployeeResponseModel();
		
		BeanUtils.copyProperties(request, response);
		
		String referenceNumber = UUID.randomUUID().toString();
		
		response.setEmployeeReferenceNumber(referenceNumber);
		
		ResponseEntity<EmployeeResponseModel> responseEntity = new ResponseEntity<EmployeeResponseModel> (response,HttpStatus.OK);
		
		return responseEntity;
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorResponse> handleNullPointerException(NullPointerException exception) {
		String errorMessage = null;
		errorMessage = exception.getMessage();
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorMessage(errorMessage);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(EmployeeConstants.DATE_PATTERN );
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		errorResponse.setTimeStamp(errorMessage);
		errorResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.toString());
		errorResponse.setErrorCode("E");
		ResponseEntity<ErrorResponse> response = new ResponseEntity<ErrorResponse>(errorResponse,
				HttpStatus.BAD_REQUEST);
		return response;

}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleNullPointerException(Exception ex) {
		String errorMessage = ex.getMessage();

		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorMessage(errorMessage);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		errorResponse.setTimeStamp(dtf.format(now));
		errorResponse.setHttpStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		errorResponse.setErrorCode("Z");

		ResponseEntity<ErrorResponse> response = new ResponseEntity<ErrorResponse>(errorResponse,
				HttpStatus.INTERNAL_SERVER_ERROR);

		return response;
	}
}
