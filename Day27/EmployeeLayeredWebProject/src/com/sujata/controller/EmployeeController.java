package com.sujata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
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
