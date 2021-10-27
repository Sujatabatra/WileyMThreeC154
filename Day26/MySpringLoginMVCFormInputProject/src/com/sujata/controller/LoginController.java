package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView getMainPage() {
		return new ModelAndView("login","command",new User());
	}
	
	@RequestMapping("/login")
	public ModelAndView loginCheckController(@ModelAttribute("command") User user) {
		String message=null;
		if(userService.loginCheck(user))
			message="Login Success!";
		else
			message="Login Failed!";
		
		return new ModelAndView("output", "msg", message);
	}
	
//	@RequestMapping("/login")
//	public ModelAndView loginCheckController(HttpServletRequest request) {
//		String una=request.getParameter("uname");
//		String pwd=request.getParameter("pwd");
//		User user=new User(una,pwd);
//		String message=null;
//		if(userService.loginCheck(user))
//			message="Login Success!";
//		else
//			message="Login Failed!";
//		
//		return new ModelAndView("output", "msg", message);
//	}
}
