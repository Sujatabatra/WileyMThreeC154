package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyDemoController {

	@RequestMapping("/first")
	public ModelAndView firstController() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Welcome to the world of Spring MVC!");
		modelAndView.setViewName("message.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/my")
	public ModelAndView secondController() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Welcome Once Again to the world of Spring MVC!");
		modelAndView.setViewName("message.jsp");
		return modelAndView;
	}
}
