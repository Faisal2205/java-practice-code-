package com.kodewala.aadhar.registration.controller;

import  org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.aadhar.registration.beans.AadharInfo;

@SuppressWarnings("deprecation")
@Controller
public class TrackAadharRegistration {

	@GetMapping("/trackAadharRegistration")
	public String trackAadharReg()
	{
		return "trackAadharRegistration";
	}
	
	@PostMapping("/trackAadhar")
	@ResponseBody
	public String showAadharStatus(@ModelAttribute AadharInfo aadharInfo, Model model)
	{
          Configuration config = new Configuration();
		
		config.configure("com\\kodewala\\aadhar\\registration\\resource\\Hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		String confirmationNumber = aadharInfo.getConfirmationNumber();
		
		Query<String> query = session.createQuery(
			    "select confirmationNumber from UserInfo where confirmationNumber = :confirmationNumber", String.class
			);
			query.setParameter("confirmationNumber", confirmationNumber);

			String confirmation = query.uniqueResult();
		
		return confirmation + " is Successfully Register.";
	}
}
