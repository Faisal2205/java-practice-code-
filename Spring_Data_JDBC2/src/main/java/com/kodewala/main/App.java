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
        
       JdbcTemplate template = (JdbcTemplate) context.getBean("createTemplate");
       
       String query = "insert into student_details(Student_id,student_name,mobile_no,Student_address) VALUES (?,?,?,?)";
       
       int cnt=template.update(query, 111,"Dheeraj", "9797979797","BTM 1st Stage");
       
       if(cnt>0)
       {
    	   System.out.println("Student details are entered...");
       }
       else {
		System.out.println("Student details are not entered please try again later........");
	}
    }
}
