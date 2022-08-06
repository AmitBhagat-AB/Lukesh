package com.ekalavya.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekalavya.employee.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping(value = "/details")
	public Employee getEmployee() {
		Employee employee = new Employee("2", "DENZEL", "WASHINGTON", "USA");
		return employee;
	}

	@GetMapping(value = "/all")
	public List<Employee> getAllEmployee() {

		List<Employee> listEmployee = new ArrayList<>();

		Employee employee1 = new Employee("102", "ABHI", "YTL", "MH2");
		Employee employee2 = new Employee("103", "RUCHA", "DELHI", "MH2");
		Employee employee3 = new Employee("104", "SONU", "MUMBAI", "MH3");
		Employee employee4 = new Employee("105", "MONU", "KALYAN", "MH4");

		listEmployee.add(employee1);
		listEmployee.add(employee2);
		listEmployee.add(employee3);
		listEmployee.add(employee4);
		
		 
		//NULL POINTER EXCEPTIONN STATUS CODE 500
		/*
		 * String a = null; System.out.println(a.length());
		 */

		return listEmployee;
	}

}
