package com.sujata.persistence;

import com.sujata.beans.Employee;
import com.sujata.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {

	Employee getEmployeeById(int employeeID)throws EmployeeNotFoundException;
}
