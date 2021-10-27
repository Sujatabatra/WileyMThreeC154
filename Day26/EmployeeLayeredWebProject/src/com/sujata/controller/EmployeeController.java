package com.sujata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public ModelAndView showMenuController() {
		return new ModelAndView("menu");
	}
	
	@RequestMapping("/insertEmpPage")
	public ModelAndView insertEmpPageController(){
		return new ModelAndView("insertEmpDetails", "command", new Employee());
	}
	
	@RequestMapping("/insertEmp")
	public ModelAndView saveEmployeeController(Employee employee) {
		String message=null;
		if(employeeService.insertEmployee(employee))
			message="Employee Saved Successfully";
		else
			message="Employee Not Saved!";
		return new ModelAndView("output", "message", message);
	}
	
	@RequestMapping("/searchEmpPage")
	public ModelAndView searchEmpPageController() {
		return new ModelAndView("searchEmployee");
	}
	
	@RequestMapping("/search")
	public ModelAndView searchEmployeeController(@RequestParam("eId") int empId) {
		Employee employee=null;
		try {
		employee=employeeService.searchEmployee(empId);
		}
		catch(EmptyResultDataAccessException exception) {
			
		}
		return new ModelAndView("employeeDetails", "emp", employee);
	}
}
