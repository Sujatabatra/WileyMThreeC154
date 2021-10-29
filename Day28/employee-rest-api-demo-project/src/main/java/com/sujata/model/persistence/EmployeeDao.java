package com.sujata.model.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
	boolean insertData(Employee employee);
	boolean deleteData(int empId);
	boolean updateSalary(int empId,int salary);
	Employee searchRecord(int empId);
}
