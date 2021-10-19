package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("empl.xml");
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("employeePresentationImpl");
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter choice");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}

	}

}
