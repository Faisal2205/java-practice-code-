package com.kodewala.main.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController {
	
	@RequestMapping("bookingService")
	public ModelAndView bookingService()
	{
		System.out.println("modelView.bookingCab()");
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("bookingConfirmation");
		return modelAndView;
	}

	
}
