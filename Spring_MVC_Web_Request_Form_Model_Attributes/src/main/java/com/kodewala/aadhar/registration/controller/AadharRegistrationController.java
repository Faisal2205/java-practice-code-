package com.kodewala.aadhar.registration.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.aadhar.registration.beans.AadharUserInfo;
import com.kodewala.aadhar.registration.cofiguration.HibernateConfig;




@Controller
public class AadharRegistrationController {

	@PostMapping("/register")
	@ResponseBody
	public String aadharRegistration(@ModelAttribute AadharUserInfo aadharUserInfo)
	{
	        
		HibernateConfig hibernateConfig = new HibernateConfig();
		hibernateConfig.getConnection(aadharUserInfo);
	        
//	        Configuration config = new Configuration();
//	        
//	        config.configure("com\\kodewala\\aadhar\\registration\\cofiguration\\Hibernate.cfg.xml");
//	        
//	        SessionFactory sessionFactory = config.buildSessionFactory();
//	        
//	        Session session = sessionFactory.openSession();
//	        
//	        Transaction txn = session.beginTransaction();
//	        
//	        session.save(aadharUserInfo);
//	        
//	        txn.commit();
		
		return "Your Aadhar Registration has been completed, You will receive an update on your registered mobile number: " + aadharUserInfo.getMobile();
	}
}
