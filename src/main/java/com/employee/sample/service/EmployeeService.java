package com.employee.sample.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.sample.model.Employee;
@Repository
public interface EmployeeService {
	
	public List<Employee> getEmployeeData();

}
