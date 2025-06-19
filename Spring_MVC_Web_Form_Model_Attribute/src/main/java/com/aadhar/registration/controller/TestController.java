package com.aadhar.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@GetMapping("/aadharRegistration")
	public String aadharRegistration()
	{
		System.out.println("aadharRegistration()");
		return "aadharRegistration";
	}
}
