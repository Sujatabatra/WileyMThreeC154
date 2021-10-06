package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

import com.sujata.bean.Employee;

public class MySecondDemoClass {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		
		employees.add(new Employee(100, "AAAA", "Associate", "IT", 25000));
		employees.add(new Employee(101, "BBBB", "Sr. Manager", "Sales", 145000));
		employees.add(new Employee(102, "CCCC", "Sr. Associate", "Marketing", 35000));
		employees.add(new Employee(103, "DDDD", "Manager", "IT", 125000));
		employees.add(new Employee(104, "EEEE", "Associate", "IT", 35000));
		employees.add(new Employee(105, "FFFF", "Manager", "Sales", 140000));
		
		// Display employee names of all employees whoes salary is greater than 50,000
//		employees.stream()
//		.filter((emp)->emp.getSalary()>50000)
//		.map((emp)->emp.getEmpName())
//		.forEach(System.out::println);
		
		employees.stream()
		.filter((emp)->emp.getSalary()>50000)
		.map(Employee::getEmpName)
		.forEach(System.out::println);
		
	}

}
