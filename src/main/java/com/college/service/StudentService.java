package com.college.service;

import java.util.List;

import com.college.model.Student;

public interface StudentService {
	
	public List<Student> getStudents();
 
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
}
