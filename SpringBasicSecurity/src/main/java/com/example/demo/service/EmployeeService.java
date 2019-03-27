package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.repositry.Employee;
import com.example.demo.controller.repositry.EmployeeRepositry;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;
	
	public Employee retrieveCourses(String pid) {		
		return employeeRepositry.findByPid(pid);
	}

}
