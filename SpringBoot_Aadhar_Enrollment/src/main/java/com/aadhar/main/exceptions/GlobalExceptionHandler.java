package com.aadhar.main.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

	@ExceptionHandler(UserRegistrationException.class)
	public String handleUserRegistrationException(UserRegistrationException ex, Model model)
	{
		model.addAttribute("eroor", ex.getCause());
		return "error";
	}
	
}
