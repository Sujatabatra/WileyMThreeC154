package com.sujata.persistence;

import com.sujata.beans.Employee;
import com.sujata.database.EmployeeDataBase;
import com.sujata.exceptions.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {

	
	@Override
	public Employee getEmployeeById(int employeeID)throws EmployeeNotFoundException {
		
		for(Employee employee:EmployeeDataBase.getEmployees() ) {
			if(employee.getEmpId()==employeeID)
				return employee;
		}
		throw new EmployeeNotFoundException("employee with id "+employeeID+" does not exist!");
	}

}
