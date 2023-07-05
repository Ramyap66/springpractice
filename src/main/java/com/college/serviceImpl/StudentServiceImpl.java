package com.college.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.college.model.Student;
import com.college.service.StudentService;
import com.college.util.DBUtil;

@Service
public class StudentServiceImpl implements StudentService {

	List<Student> studentlist = new ArrayList<Student>();
	
	Connection connection;
	
	public StudentServiceImpl() throws ClassNotFoundException
	{
		connection = DBUtil.getConnection();
	}
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		
		studentlist.clear();
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM STUDENTS ");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Student stud = new Student();
			stud.setId(rs.getInt(1));
			stud.setName(rs.getString(2));
			stud.setBranch(rs.getString(3));
			stud.setEmail(rs.getString(4));
			stud.setAddress(rs.getString(5));
			stud.setPhone(rs.getInt(6));
			
			studentlist.add(stud);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studentlist;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		int id = student.getId();
		String name = student.getName();
		String branch = student.getBranch();
		String email = student.getEmail();
		String address = student.getAddress();
		int phone = student.getPhone();
		
		System.out.println("data :" +name+ " "+branch+" "+email+" "+address+" "+phone);
		
		String insertQuery = "INSERT INTO STUDENTS VALUES("+id+",'"+name+"','"+branch+"','"+email+"','"+address+"',"+phone+")";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(insertQuery);
			stmt.executeUpdate();
			System.out.println("Student data added Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
		int id = student.getId();
		String name = student.getName();
		String branch = student.getBranch();
		String email = student.getEmail();
		String address = student.getAddress();
		int phone = student.getPhone();
		
		String updateQuery = "UPDATE STUDENTS SET name = '"+name+"',branch='"+branch+"',email='"+email+"',address='"+address+"',phone="+phone+" WHERE id="+id+"";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(updateQuery);
			stmt.executeUpdate();
			System.out.println("Student data updated Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Student data update failed");
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		String deleteQuery = "delete from students where id = '"+id+"';";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(deleteQuery);
			stmt.executeUpdate();
			System.out.println("Student data deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Student data failed to delete");
			e.printStackTrace();
		}
		
	}

}
