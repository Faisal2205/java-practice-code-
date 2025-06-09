package com.kodewala.main.booking.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CancelBookingController {

	@RequestMapping("cancelBooking")
	public ModelAndView cancelBooking()
	{
		System.out.println("modelAndView.cancelBooking()");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("cancelConfirmation");
		return modelAndView;
		
	}
}
