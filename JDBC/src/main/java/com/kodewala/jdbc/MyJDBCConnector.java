package com.kodewala.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MyJDBCConnector {
      
	public void selectRecords() throws  ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 -  create connection
		String url = "jdbc:mysql://localhost:3306/student_info";
		String userName = "root";
		String password = "Password@123";

		Connection con = DriverManager.getConnection(url, userName, password);

		// Step#3 -  create statement object
		Statement stmt = con.createStatement();

//		String sql = " update student_details set student_address = 'Bangalore' where student_id = 101";
		String sql = "Select * from student_details";

		//Step#4 -  execute query
		ResultSet rs = stmt.executeQuery(sql);
		
//		int updateRecords = stmt.executeUpdate(sql);
//		System.out.println(updateRecords);
		
		while(rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getNString(2);
			String mobileNo = rs.getNString(3);
			String address = rs.getNString(4);
			
			System.out.println("Student_id = "+id +" "+ "Student Name = "+name +" "+ " Mobile No = "+mobileNo +" "+ "Address = "+address );
		}
	}
}
