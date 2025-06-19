package com.kodewala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.beans.UserInfo;

@RestController
public class TestController {

	@Autowired
	private UserInfo userInfo;
	
	@GetMapping("/")
	public String showMe()
	{
		return "Hello how are you!" + " and " + userInfo.showInfo();
	}
}

