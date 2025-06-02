package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnectorPS {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Student_info";
		String username = "root";
		String password = "Password@123";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		String sql = "Select * from student_details where student_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, 101);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			int id = rs.getInt(1);
		    String pass = rs.getNString(2);
		    String hintQues = rs.getNString(3);
		    String hintAns =  rs.getNString(4);
		    
		    System.out.println(id +" "+pass +" "+ hintQues+" "+hintAns);
		}
	}

}
