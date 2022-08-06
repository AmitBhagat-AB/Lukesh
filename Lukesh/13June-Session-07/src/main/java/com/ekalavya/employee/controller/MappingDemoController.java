package com.ekalavya.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MappingDemoController {
	
	@GetMapping(value = "/hi/{name}/{id}")
	public String sayHi(@PathVariable String name, @PathVariable (required = false)int id ) {
		return "Hi " +name + " My ID is"+id ;
	}
	
	@GetMapping(value = "/hello")
	public String sayHello(@RequestParam String firstName , @RequestParam(required = false , defaultValue = "default") String lastName ,
			@RequestParam (required = false, defaultValue = "Pune")String city) {
	if (lastName== null) {
		lastName ="";
	}
		return "Hello "+firstName +" "+lastName + "City" +city;
	}


}
