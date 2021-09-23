package com.sujata.onedarrays;

import java.util.Scanner;

public class EmployeeListMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter total no of employees : ");
		int total=scanner.nextInt();
		
		EmployeeList employeeList=new EmployeeList(total);
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter "+(index+1)+" employee id : ");
			int id=scanner.nextInt();
			System.out.println("Enter "+(index+1)+" employee Name : ");
			String name=scanner.next();
			
			Employee employee=new Employee(id, name);
			employeeList.inputEmployee(employee, index);
		}
		
		for(Employee employee:employeeList.getEmployees()) {
//			System.out.println(employee.geteId()+" "+employee.geteName());
			/*
			 * whenever we are trying to print object , hashcode gets displayed
			 */
			System.out.println(employee); //toString()
		}

	}

}
