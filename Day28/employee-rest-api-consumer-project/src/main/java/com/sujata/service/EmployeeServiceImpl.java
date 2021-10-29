package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private RestTemplate RestTemplate;
	
	@Override
	public Employee getEmployeeById(int empId) {
		return RestTemplate.getForObject("http://localhost:8085/employees/"+empId, Employee.class);
	}

}
