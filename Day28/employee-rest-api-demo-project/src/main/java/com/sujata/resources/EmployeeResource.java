package com.sujata.resources;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.model.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path = "/employees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Employee> getAllEmployeesResource(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping(path = "/employees/{eid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeByIdResource(@PathVariable("eid") int empId) {
		return employeeService.searchEmployee(empId);
	}
	
	@PostMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee insertEmployeeResource(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@DeleteMapping(path="/employees/{eid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee deleteEmployeeResource(@PathVariable("eid") int empId) {
		return employeeService.deleteEmployee(empId);
	}
	
	@PutMapping(path = "/employees/{eid}/{sal}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployeeSalaryResource(@PathVariable("eid") int empId,@PathVariable("sal") int salary) {
		return employeeService.updateSalary(empId, salary);
	}
	
	@GetMapping(path="/employees/payslip/{eid}",produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeePayslip getPaySlipResource(@PathVariable("eid") int empId) {
		return employeeService.paySlip(empId);
	}
}
