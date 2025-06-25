package com.kodewala.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.main.beans.AadharUserInfo;
import com.kodewala.main.service.AadharRegistrationImp;

@Controller
public class AadharRegController {
	
	@Autowired
	AadharRegistrationImp aadharRegistrationImp;

	@GetMapping("/")
	public String aadharRegistration(Model model)
	{
		AadharUserInfo aadharUserInfo = new AadharUserInfo();
		
		model.addAttribute("AadharUserInfo",aadharUserInfo);
		return "registrationForm";
	}
	
	@PostMapping("/register")
	@ResponseBody
	public String enrollment(@ModelAttribute AadharUserInfo aadharUserInfo, Model model)
	{
	
		boolean status =  aadharRegistrationImp.doAadharRegistration(aadharUserInfo);
		
		System.out.println("AadharRegController.enrollment() and status is: " + status);
		
		if(status)
			return "Success";
		
		else {
			return "Failed";
		}
	}
}
