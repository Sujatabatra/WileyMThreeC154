package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public ArrayList<Employee> getAllEmployees() throws SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee) throws SQLException{
		
		return employeeDao.insertData(employee);
	}

	@Override
	public boolean deleteEmployee(int empId)throws SQLException {
		
		return employeeDao.deleteData(empId);
	}

	@Override
	public boolean updateSalary(int empId, int salary)throws SQLException {
		return employeeDao.updateSalary(empId, salary);
	}

	@Override
	public Employee searchEmployee(int empId)throws SQLException {
		return employeeDao.searchRecord(empId);
	}

}
