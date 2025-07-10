package com.kodewala.main;

import java.sql.SQLException;

import com.kodewala.main.jdbc.JdbcConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JdbcConnection jdbcConnection =  new JdbcConnection();
        
        try {
			jdbcConnection.doConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
