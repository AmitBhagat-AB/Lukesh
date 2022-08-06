package com.ekalavya.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekalavya.employee.model.Employee;
import com.ekalavya.employee.model.EmployeeRequestModel;
import com.ekalavya.employee.model.EmployeeResponseModel;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping(value = "/details", produces = {MediaType.APPLICATION_XML_VALUE ,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Employee> getEmployee() {
		Employee employee = new Employee("2", "DENZEL", "WASHINGTON", "USA");
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(employee, HttpStatus.OK);
		return response;
	}

	@GetMapping(value = "/all")
	public ResponseEntity<List<Employee>> getAllEmployee() {

		List<Employee> listEmployee = new ArrayList<>();

		Employee employee1 = new Employee("102", "ABHI", "YTL", "MH2");
		Employee employee2 = new Employee("103", "RUCHA", "DELHI", "MH2");
		Employee employee3 = new Employee("104", "SONU", "MUMBAI", "MH3");
		Employee employee4 = new Employee("105", "MONU", "KALYAN", "MH4");

		listEmployee.add(employee1);
		listEmployee.add(employee2);
		listEmployee.add(employee3);
		listEmployee.add(employee4);

		ResponseEntity<List<Employee>> response = new ResponseEntity<List<Employee>>(listEmployee, HttpStatus.ACCEPTED);

		return response;
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<EmployeeResponseModel> createEmployee(@RequestBody EmployeeRequestModel request) {
		
		EmployeeResponseModel response = new EmployeeResponseModel();
		
		BeanUtils.copyProperties(request, response);
		
		String referenceNumber = UUID.randomUUID().toString();
		
		response.setEmployeeReferenceNumber(referenceNumber);
		
		ResponseEntity<EmployeeResponseModel> responseEntity = new ResponseEntity<EmployeeResponseModel> (response,HttpStatus.OK);
		
		return responseEntity;
	}


}
