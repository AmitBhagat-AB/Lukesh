package com.ekalavya.employee.service;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekalavya.employee.dao.EmployeeDao;
import com.ekalavya.employee.dto.EmployeeDto;
import com.ekalavya.employee.model.EmployeeRequestModel;
import com.ekalavya.employee.model.EmployeeResponseData;
import com.ekalavya.employee.model.EmployeeResponseModel;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public EmployeeResponseData saveEmployee(EmployeeRequestModel request) {
		EmployeeResponseData data = new EmployeeResponseData();
		EmployeeResponseModel response = new EmployeeResponseModel();
		EmployeeDto employeeDto = new EmployeeDto();

		BeanUtils.copyProperties(request, employeeDto);

		String referenceNumber = UUID.randomUUID().toString().substring(0, 24);

		employeeDto.setEmployeeReferenceNumber(referenceNumber);

		employeeDto = employeeDao.saveEmployee(employeeDto);

		BeanUtils.copyProperties(employeeDto, response);

		response.setEmployeeName(employeeDto.getFirstName() + " " + employeeDto.getLastName());

		data.setDetails(response);
		
		return data;
	}

}
