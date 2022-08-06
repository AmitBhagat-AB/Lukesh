package com.ekalavya.employee.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ekalavya.employee.model.EmployeeRequestModel;
import com.ekalavya.employee.model.EmployeeResponseData;
import com.ekalavya.employee.model.EmployeeResponseModel;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@PostMapping(value = "/save", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE } ,consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<EmployeeResponseData> createEmployee(@Valid @RequestBody EmployeeRequestModel request) {

		EmployeeResponseData data = new EmployeeResponseData();

		EmployeeResponseModel response = new EmployeeResponseModel();

		BeanUtils.copyProperties(request, response);

		String referenceNumber = UUID.randomUUID().toString();

		response.setEmployeeReferenceNumber(referenceNumber);

		response.setEmployeeName(request.getFirstName() + "" + request.getLastName());

//		data.setData(response);
		data.setDetails(response);

		ResponseEntity<EmployeeResponseData> responseEntity = new ResponseEntity<EmployeeResponseData>(data,
				HttpStatus.OK);

		return responseEntity;
	}

}
