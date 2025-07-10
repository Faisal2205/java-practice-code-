package com.aadhar.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aadhar.main.beans.AadharUserInfo;
import com.aadhar.main.entity.UserInfo;
import com.aadhar.main.services.AadharRegistrationImp;


@Controller
public class AadharRegistationController {
	
	@Autowired
	AadharRegistrationImp aadharRegistrationImp;
	
	

	@GetMapping("/")
	public String aadharRegistrationForm(Model model)
	{
		AadharUserInfo aadharUserInfo = new AadharUserInfo();
		model.addAttribute("AadharUserInfo",aadharUserInfo);
		return "registrationForm";
	}
	
	@PostMapping("/register")
	public String enrollAadhar(@ModelAttribute AadharUserInfo aadharUserInfo, UserInfo userInfo, Model model)
	{
		
		userInfo = aadharRegistrationImp.doAadharRegistration(aadharUserInfo);
		
		System.out.println("AadharRegistationController.enrollAadhar() and status: ");
		
		
		String referenceNumber = userInfo.getReferenceNumber();
		
		if(userInfo != null)
		{
			model.addAttribute("UserInfo", userInfo);
			System.out.println(referenceNumber);
			return "success";
		}
		else
			return "failed";
		
	}
}
