package com.kodewala.main.booking.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class BookingController {
	
	@RequestMapping("/bookingService")
	public ModelAndView bookCab()
	{
	    System.out.println("BookingController.bookCab()");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("bookingConfirmation");
		return modelAndView;
	}

}
