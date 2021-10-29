package com.sujata.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees();
	Employee insertEmployee(Employee employee);
	boolean deleteEmployee(int empId);
	boolean updateSalary(int empId,int salary);
	Employee searchEmployee(int empId);
	EmployeePayslip paySlip(int empId);
}
