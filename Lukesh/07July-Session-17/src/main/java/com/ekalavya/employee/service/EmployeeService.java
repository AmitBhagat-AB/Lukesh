package com.ekalavya.employee.service;

import java.util.List;

import com.ekalavya.employee.model.Employee;
import com.ekalavya.employee.model.EmployeeRequestModel;
import com.ekalavya.employee.model.EmployeeResponseData;

public interface EmployeeService {

	EmployeeResponseData getEmployeeDetails(int empId);
	
	List<EmployeeResponseData> getAllEmployees();
	
	EmployeeResponseData saveEmployee(EmployeeRequestModel request);

	Employee getEmployee();
	
	List<EmployeeResponseData> getEmployeeByFirstNameAndLastName(String firstName ,String lastName );
	
}
