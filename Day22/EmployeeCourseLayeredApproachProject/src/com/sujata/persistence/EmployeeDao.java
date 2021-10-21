package com.sujata.persistence;

import com.sujata.beans.Employee;

public interface EmployeeDao {

	Employee getEmployeeById(int employeeID);
}
