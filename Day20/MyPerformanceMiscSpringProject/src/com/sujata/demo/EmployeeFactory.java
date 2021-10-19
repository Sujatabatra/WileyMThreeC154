package com.sujata.demo;

public class EmployeeFactory {

	Employee getSalariedEmployee() {
		return new SalariedEmployee();
	}
	
	Employee getWagedEmployee() {
		return new WagedEmployee();
	}
}
