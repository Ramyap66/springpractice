package com.employee.sample.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.sample.DBUtil.DBUtil;
import com.employee.sample.model.Employee;
import com.employee.sample.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	static List<Employee> employeelist = new ArrayList();
	
	Connection connection;
	
	public EmployeeServiceImpl() throws SQLException
	{
		connection = DBUtil.getConnection();
	}
	
	@Override
	public List<Employee> getEmployeeData() {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM EMPLOYEE_DATA");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeename(rs.getString(1));
				emp.setMailid(rs.getString(2));
				emp.setNumber(rs.getInt(3));
				emp.setState(rs.getString(4));
				emp.setJob_role(rs.getString(5));
				employeelist.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeelist;
	}

}
