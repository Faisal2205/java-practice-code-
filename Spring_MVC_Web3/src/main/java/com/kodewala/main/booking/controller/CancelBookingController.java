package com.kodewala.main.booking.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class CancelBookingController {

	@RequestMapping("/cancelBooking")
	public ModelAndView cancelCab()
	{
		System.out.println("CancelBookingController.cancelCab()");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("cancelBooking");
		return modelAndView;
	}
}
