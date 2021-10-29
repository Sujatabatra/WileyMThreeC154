package com.sujata.resources;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.model.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Employee> getAllEmployeesResource(){
		return employeeService.getAllEmployees();
	}
}
