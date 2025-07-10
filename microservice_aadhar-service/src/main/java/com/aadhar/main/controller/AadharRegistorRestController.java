package com.aadhar.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aadhar.main.beans.AadharUserInfo;
import com.aadhar.main.entity.UserInfo;
import com.aadhar.main.services.AadharRegistrationImp;

@RestController
@RequestMapping("/api/aadhar")
public class AadharRegistorRestController {

	@Autowired
	AadharRegistrationImp aadharRegistrationImp;
	
	

//	@GetMapping("/")
//	public String aadharRegistrationForm(Model model)
//	{
//		AadharUserInfo aadharUserInfo = new AadharUserInfo();
//		model.addAttribute("AadharUserInfo",aadharUserInfo);
//		return "registrationForm";
//	}
//	
	
	@PostMapping("/register")
	public ResponseEntity<Map<String, Object>> enrollAadhar(@RequestBody AadharUserInfo aadharUserInfo)
	{
		
		UserInfo userInfo = new UserInfo();
		
		userInfo = aadharRegistrationImp.doAadharRegistration(aadharUserInfo);
		
		System.out.println("AadharRegistationController.enrollAadhar() and status: ");
		
		String referenceNumber = userInfo.getReferenceNumber();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(userInfo != null)
		{
		
			map.put("message", "Aadhar Registered Succesfully");
			
		     return	ResponseEntity.ok(map);
		}
		else 
			map.put("message", "Aadhar Registration failed");
		    return ResponseEntity.ok(map);
}
}
