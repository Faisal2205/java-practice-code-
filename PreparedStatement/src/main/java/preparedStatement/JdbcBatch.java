package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/student_info";
		String username = "root";
		String password = "Password@123";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class laoded Successfully.");
		}
		catch(ClassNotFoundException cn)
		{
			System.out.println(cn.getMessage());
		}
		try
		{
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Create Successfully.");
			
			String query = "Insert into student_details(student_id , Student_name, mobile_No, Student_Address) VALUES (?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			
			while(true)
			{
				System.out.print("student_id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Student_name: ");
				String name = sc.nextLine();
				System.out.print("Mobile_No: ");
				String MobileNo = sc.nextLine();
				System.out.print("Address: ");
				String Address = sc.nextLine();
				
				ps.setInt(1, id);
				ps.setNString(2, name);
				ps.setNString(3, MobileNo);
				ps.setNString(4, Address);
				
				ps.addBatch();
				
				System.out.println("Add more student details Yes/No ?: ");
				String checkCondition = sc.nextLine();
				
				if(checkCondition.toUpperCase().equals("NO"))
				{
					break;
				}
			}
			int [] result = ps.executeBatch();
			
			System.out.println("Batch Execute Successfully...");
		}
		
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
