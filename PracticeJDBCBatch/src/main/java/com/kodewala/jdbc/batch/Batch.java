package com.kodewala.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
    
		String url = "jdbc:mysql://localhost:3306/student_info";
		String username = "root";
		String password = "Password@123";
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		Connection connection = DriverManager.getConnection(url,username,password);
		
		String insertQuery = ("Insert into student_details(student_id , Student_name, mobile_No, Student_Address) VALUES (?,?,?,?)");
		
		PreparedStatement ps =connection.prepareStatement(insertQuery);
		
		
		ps.setInt(1, 106);
		ps.setNString(2, "Rakesh");
		ps.setNString(3, "9876789870");
		ps.setNString(4, "BTM, Bangalore");
		ps.addBatch();
		
		int result [] = ps.executeBatch();
		
		System.out.println(result);
		
	}

}
