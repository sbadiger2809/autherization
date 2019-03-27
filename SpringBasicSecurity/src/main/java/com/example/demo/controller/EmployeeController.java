package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.repositry.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employess/{empId}")
	public Employee retrieveCoursesForStudent(@PathVariable String empId) {
		return employeeService.retrieveCourses(empId);
	}
	
	
	@GetMapping("/test")
	public String retrieveCoursesForStudent() {
		return "Test";
	}
	
}
