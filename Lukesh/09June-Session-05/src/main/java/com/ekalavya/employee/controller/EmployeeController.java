package com.ekalavya.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class EmployeeController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "HELLO AMIT";
		
	}
	
	@GetMapping(value = "/hi")
	public String sayHi() {
		return "HI AMIT";
	}


}
