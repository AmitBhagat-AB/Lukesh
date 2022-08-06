package com.ekalavya.employee.service;

import com.ekalavya.employee.model.EmployeeRequestModel;
import com.ekalavya.employee.model.EmployeeResponseData;

public interface EmployeeService {
	
	EmployeeResponseData saveEmployee(EmployeeRequestModel request);

}
