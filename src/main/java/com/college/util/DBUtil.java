package com.college.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection connection = null;
	
	public static Connection getConnection() throws ClassNotFoundException
	{
	
			if(connection!=null)
			{
			return connection;
		} 
	
	
	else {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";
		String user = "root";
		String passsword = "admin123";
		Class.forName(driver);
		try {
		connection = DriverManager.getConnection(url,user,passsword);
		
	}catch(SQLException e) {
		
		e.printStackTrace();
		
	}
	}
			return connection;
}
}
