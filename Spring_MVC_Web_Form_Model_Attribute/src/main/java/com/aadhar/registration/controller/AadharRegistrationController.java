package com.aadhar.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aadhar.registration.beans.AadharUserDetails;
import com.aadhar.registration.configuration.HibernateConfig;

@Controller
public class AadharRegistrationController {

	@PostMapping("/register")
	@ResponseBody
	public String doRegistor(@ModelAttribute AadharUserDetails aadharUserDetails)
	{
		HibernateConfig hibernateConfig = new HibernateConfig();
		hibernateConfig.doConnection(aadharUserDetails);
		return "Your Aadhar registration done.";
	}
}
