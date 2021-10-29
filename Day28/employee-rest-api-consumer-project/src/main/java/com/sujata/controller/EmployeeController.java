package com.sujata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public ModelAndView getMainPage() {
		return new ModelAndView("menu");
	}
	
	@RequestMapping("/searchEmpPage")
	public ModelAndView searchEmpPageController() {
		return new ModelAndView("searchEmployee");
	}
	
	@RequestMapping("/search")
	public ModelAndView searchEmployeeController(@RequestParam("eId") int empId) {
		Employee employee=null;
		try {
		employee=employeeService.getEmployeeById(empId);
		}
		catch(Exception exception) {
			
		}
		return new ModelAndView("employeeDetails", "emp", employee);
	}

}
