package com.kodewala.main.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnection {
	
	public static void doConnection() throws SQLException
	{
		
		String url = "jdbc:mysql://localhost:3306/student_info";
		String username = "root";
		String password = "Password@123";
		
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	  
	  Connection connection = DriverManager.getConnection("url","username","password");
	  
	  Statement statement =  connection.createStatement();
	  
	  String query = "Select * from student_details";
	  
	 ResultSet resultset =  statement.executeQuery(query);
	 
	 while(resultset.next())
	 {
		 int id = resultset.getInt(1);
			String name = resultset.getNString(2);
			String mobileNo = resultset.getNString(3);
			String address = resultset.getNString(4);
			
			System.out.println("Student_id = "+id +" "+ "Student Name = "+name +" "+ " Mobile No = "+mobileNo +" "+ "Address = "+address );
	 }
		
	}
}
