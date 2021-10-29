package com.sujata.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePayslip;
import com.sujata.model.persistence.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public ArrayList<Employee> getAllEmployees(){
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee insertEmployee(Employee employee){
		if(employeeDao.insertData(employee))
			return employee;
		return null;
	}

	@Override
	public boolean deleteEmployee(int empId){
		
		return employeeDao.deleteData(empId);
	}

	@Override
	public boolean updateSalary(int empId, int salary){
		return employeeDao.updateSalary(empId, salary);
	}

	@Override
	public Employee searchEmployee(int empId){
		return employeeDao.searchRecord(empId);
	}

	@Override
	public EmployeePayslip paySlip(int empId) {
		Employee employee=employeeDao.searchRecord(empId);
		EmployeePayslip employeePayslip=new EmployeePayslip();
		employeePayslip.setHra(.15*employee.getEmpSalary());
		employeePayslip.setDa(.08*employee.getEmpSalary());
		employeePayslip.setPf(.12*employee.getEmpSalary());
		employeePayslip.setTotalSalary(employee.getEmpSalary()+employeePayslip.getHra()+employeePayslip.getDa()-employeePayslip.getPf());
		employeePayslip.setEmployee(employee);
		return employeePayslip;
	}

}
