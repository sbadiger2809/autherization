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

	@PreAuthorize("hasAuthority('USER')")  
	@GetMapping("/employess/{empId}")
	public Employee retrieveCoursesForStudent(@PathVariable String empId) {
	System.out.println("retrieveCoursesForStudent::==>");
		return employeeService.retrieveCourses(empId);
	}
	
		
	@PreAuthorize("hasAuthority('ADMIN')")  
	@GetMapping("/test")
	public String retrieveCoursesForStudent() {
		return "Test";
	}
	
  // @PreAuthorize("@currentUserService.canAccessUser(principal, #name)") 
	//@PreAuthorize("@currentUserService.canAccessTest( #name)") 
	 @PreAuthorize("@currentUserService.canAccessUserTest(principal, #name)") 
	@GetMapping("/demo/{name}")
	public String demotest(@PathVariable String name) {
		return "Test";
	}
}
