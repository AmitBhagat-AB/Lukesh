package com.ekalavya.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ekalavya.employee.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping(value = "/student_details")
	public Student getStudent() {
		
		Student student =new Student("1001","BREZ","SKLOVAKIA","USSR");
		return student;
	}
	
	@GetMapping(value = "/allstudents")
	public List<Student> getAllStudents() {
		
		List<Student> listStudent= new ArrayList<>();
		
		Student student1 = new Student ("1002","PREZ","ISLAM","PAK");
		Student student2 = new Student ("1003","CHINTU","PUNE","MH1");
		Student student3 = new Student ("1004","SOMYA","MUMBAI","MH2");
		Student student4 = new Student ("1005","PINTU","THANE","MH3");
		
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		listStudent.add(student4);
		
		return listStudent;
	}


}
