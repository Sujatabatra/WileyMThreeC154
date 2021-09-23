package com.sujata.onedarrays;

public class EmployeeList {

	Employee[] employees;
	int totalNoOfEmployees;
	public EmployeeList(int totalNoOfEmployees) {
		super();
		this.totalNoOfEmployees = totalNoOfEmployees;
		employees=new Employee[totalNoOfEmployees];
	}
	
	public void inputEmployee(Employee employee,int index) {
		employees[index]=employee;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}
	
	
	
}
