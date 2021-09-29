package com.sujata.service;

import com.sujata.beans.Employee;
import com.sujata.exceptions.EmployeeNotFoundException;

public interface EmployeeService {

	Employee searchEmployeeById(int employeeId)throws EmployeeNotFoundException;
}
