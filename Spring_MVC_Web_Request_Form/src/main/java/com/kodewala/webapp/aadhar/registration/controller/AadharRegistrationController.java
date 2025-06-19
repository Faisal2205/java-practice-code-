package com.kodewala.webapp.aadhar.registration.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.webapp.aadhar.registration.resource.JdbcConfig;


@Controller
public class AadharRegistrationController {
	
	@PostMapping("/register")
	@ResponseBody
	public String registerForAadhar(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("fatherName") String fatherName,@RequestParam("motherName") String motherName, @RequestParam("mobile") String mobile, @RequestParam("address") String address)
	{
		System.out.println("registor for Aadhar:::::::::::::");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Father Name: " + fatherName);
		System.out.println("Mother Name: " + motherName);
		System.out.println("Address: " + address);
		System.out.println("Mobile: " + mobile);
		  
		// Call Service and DAO.. Insert Data into database....
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
	       JdbcTemplate template =  (JdbcTemplate) context.getBean("createJdbcTemplate");
	       
	       String query = "insert into Aadhar_Registration(firstName,lastName,fatherName,motherName,Mobile,Address)values (?,?,?,?,?,?) ";
	       
	        int res = template.update(query,firstName,lastName,fatherName,motherName,mobile,address );
	       
//	       if (res > 0)
//			{
//				System.out.println("Registration has been successfully completed");
//			} else
//			{
//				System.out.println("Registration is failed.... Please try Again");
//			}
	       
		
		
		return "You have registered for an aadhar. You will receive an update on your registered mobile number: "
				+ mobile;
	}

}
