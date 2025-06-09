package com.kodewala.main.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CancelBooking {

	@RequestMapping("cancelTrainTicket")
	public ModelAndView cancelTrainTicket()
	{
		System.out.println("CancelBooking.cancelTrainTicket()");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("cancelConfirmation");
		return modelAndView;
	}
}
