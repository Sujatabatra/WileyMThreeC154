package com.sujata.service;

import com.sujata.beans.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();

	@Override
	public Employee searchEmployeeById(int employeeId) {

		return employeeDao.getEmployeeById(employeeId);
	}

}
