package com.sujata.persistence;

import com.sujata.beans.Employee;
import com.sujata.database.EmployeeDataBase;

public class EmployeeDaoImpl implements EmployeeDao {

	
	@Override
	public Employee getEmployeeById(int employeeID) {
		
		for(Employee employee:EmployeeDataBase.getEmployees() ) {
			if(employee.getEmpId()==employeeID)
				return employee;
		}
		return null;
	}

}
