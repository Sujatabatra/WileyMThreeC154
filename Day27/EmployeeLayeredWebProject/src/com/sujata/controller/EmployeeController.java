package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.bean.User;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.LoginService;

@Controller
@SessionAttributes({"user"})
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public ModelAndView showLoginPage() {
		return new ModelAndView("login","command",new User());
	}
	@RequestMapping("/loginCheck")
	public ModelAndView showMenuController(@ModelAttribute("command") User user/*,HttpSession session*/) {
		if(loginService.loginCheck(user)) {
			ModelAndView mv=new ModelAndView();
			mv.addObject("user", user);
//			session.setAttribute("user", user);
			mv.setViewName("menu");
			return mv;
		}
		return new ModelAndView("login", "message", "Login Failed");
	}
	
	@RequestMapping("/menu")
	public ModelAndView showMenu() {
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
	
	@RequestMapping("/deleteEmpPage")
	public ModelAndView deleteEmpPageController() {
		return new ModelAndView("deleteEmp");
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmpController(@RequestParam("eId") int empId) {
		String message=null;
		if(employeeService.deleteEmployee(empId))
			message="Employee Deleted Successfully!";
		else
			message="Employee Deletion Failed";
		return new ModelAndView("output","message",message);
			
	}
	
	@RequestMapping("/updateSalaryPage")
	public ModelAndView updateSalaryPageController() {
		return new ModelAndView("updateEmpSalary","command",new Employee());
	}
	
	@RequestMapping("/updateSalary")
	public ModelAndView updateSalaryController(@ModelAttribute("command")Employee employee) {
		String message=null;
		if(employeeService.updateSalary(employee.getEmpId(), employee.getEmpSalary()))
			message="Employee Salary Updated Successfully!";
		else
			message="Employee Salary Updation Failed";
		return new ModelAndView("output","message",message);
	}
	
	@RequestMapping("/payslipPage")
	public ModelAndView payslipPageController() {
		return new ModelAndView("idInputForPayslip");
	}
	@RequestMapping("/payslip")
	public ModelAndView payslipController(@RequestParam("eId") int empId) {
		EmployeePayslip payslip=employeeService.paySlip(empId);
		return new ModelAndView("empPayslip", "payslip", payslip);
	}
	
	@RequestMapping("/getAllEmps")
	public ModelAndView getAllEmployeesController() {
		List<Employee> employees=employeeService.getAllEmployees();
		return new ModelAndView("showAllEmployees", "employees", employees);
	}
}
