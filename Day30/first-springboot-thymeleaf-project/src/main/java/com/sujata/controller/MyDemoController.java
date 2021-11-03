package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyDemoController {

	@RequestMapping("/first")
	public ModelAndView firstController() {
		return new ModelAndView("my", "message", "Welcome to the world of Thymeleaf View Template");
		
	}
}
