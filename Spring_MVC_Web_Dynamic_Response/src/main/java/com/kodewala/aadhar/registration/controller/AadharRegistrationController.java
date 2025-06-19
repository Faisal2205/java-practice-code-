package com.kodewala.aadhar.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.aadhar.registration.beans.UserInfo;
import com.kodewala.aadhar.registration.resource.HibernateConfig;

@Controller
public class AadharRegistrationController {

	@GetMapping("/showRegisterForm")
	public String aadharRegistrationController()
	{
		return "showRegisterForm";
	}
	
	
	@PostMapping("/register")
	public String RegisterForAadhar(@ModelAttribute UserInfo userInfo, Model model)
	{
		long confirmationNumber = 1_000_000_000L + (long)(Math.random() * 9_000_000_00000L);

		userInfo.setConfirmationNumber(confirmationNumber + "");
		
		System.out.println("Confirmation Number: " + userInfo.getConfirmationNumber());
		System.out.println("First Name: " + userInfo.getFirstName());
		System.out.println("Last Name: " + userInfo.getLastName());
		System.out.println("Mobile: " + userInfo.getMobile());
		System.out.println("Address: " + userInfo.getAddress());
		
		model.addAttribute("user", userInfo);
		
		HibernateConfig hibernateConfig = new HibernateConfig();
		hibernateConfig.doConnection(userInfo);

		return "displayConfirmation";
	}
}
