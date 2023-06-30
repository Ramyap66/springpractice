package com.employee.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.sample.model.Employee;
import com.employee.sample.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("/student")
	public List<Employee> getEmployees(){
		
		return this.empservice.getEmployeeData();
	}

}
