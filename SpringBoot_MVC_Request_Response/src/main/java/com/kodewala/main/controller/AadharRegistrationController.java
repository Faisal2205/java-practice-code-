package com.kodewala.main.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.main.beans.UserInfo;
import com.kodewala.main.resource.UserInfoRepository;

@Controller
public class AadharRegistrationController {
	
	@Autowired
    private UserInfoRepository repository;

	@GetMapping("/")
	public String showRegistrationPage(Model model)
	{
		UserInfo userInfo = new UserInfo();
		
		model.addAttribute("UserInfo",userInfo);
		return "registrationForm";
	}
	
	
	@PostMapping("/register")
	public String aadharEnrollment(Model model, @ModelAttribute UserInfo userInfo)
	{
		String firstName = userInfo.getFirstName();
		String lastName = userInfo.getLastName();
		String mobileNumber = userInfo.getMobileNumber();
		String address = userInfo.getAddress();
		
		System.out.println("firstName: "+ firstName );
		System.out.println("lastName: "+ lastName );
		System.out.println("mobileNumber: "+ mobileNumber );
		System.out.println("address: "+ address );
		
		String referenceNumber = UUID.randomUUID().toString().substring(0,8).toUpperCase();
		
		userInfo.setReferenceNumber(referenceNumber);
		
		userInfo.setAadhaarStatus("Confirmed");
		repository.save(userInfo);
		
		model.addAttribute("user", userInfo);
		 
		 return "registrationSuccess";
		 
	}
	
	
}
