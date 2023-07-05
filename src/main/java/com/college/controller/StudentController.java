package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Student;
import com.college.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentervice;
	
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello learners welcome to new spring Boot tech world";
	}
	@GetMapping("/students")
	public List<Student> getStudentsDetails()
	{
		return this.studentervice.getStudents();
	}
	
	@PostMapping("/addstudent")
	public void addStudent(@RequestBody Student student) {
		studentervice.addStudent(student);
	}
	
	@PutMapping("/updatestudent")
	public void updateStudent(@RequestBody Student student)
	{
		studentervice.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletestudent/{id}")
	public void deleteStudents(@PathVariable int id)
	
	{
		studentervice.deleteStudent(id);
	}

}
