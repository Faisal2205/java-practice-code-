package com.kodewala.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kodewala.main.resource.JdbcConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
       JdbcTemplate template =  (JdbcTemplate) context.getBean("createJdbcTemplate");
       
       String query = "insert into student_details(Student_id, Student_Name, Mobile_No, Student_Address)values (?,?,?,?) ";
       
        int res = template.update(query,110,"Amir","1233210987","BTM Bangalore" );
       
       if (res > 0)
		{
			System.out.println("  Order created and inserted in Orders table.");
		} else
		{
			System.out.println(" Query has not Created");
		}
       
       
    }
}
