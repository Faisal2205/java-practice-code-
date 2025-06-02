package com.kodewala.jdbc;

import java.sql.SQLException;

public class MyFirstJDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
        
			MyJDBCConnector connector = new MyJDBCConnector();

			try
			{
				connector.selectRecords();

			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
