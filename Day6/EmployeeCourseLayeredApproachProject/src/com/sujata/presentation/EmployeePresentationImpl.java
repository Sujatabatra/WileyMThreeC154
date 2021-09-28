package com.sujata.presentation;

import java.util.Scanner;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;
import com.sujata.service.CourseService;
import com.sujata.service.CourseServiceImpl;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private CourseService courseService=new CourseServiceImpl();
	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Courses");
		System.out.println("2. Register For Course");
		System.out.println("3. DeRegister For Course");
		System.out.println("4. List the participants of Specific Course");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			Course[] courses=courseService.getAllCoursesForEmployee();
			for(Course course:courses) {
				System.out.println(course);
			}
			break;
		case 2:
			System.out.println("Enter Employee ID: ");
			int empId=scanner.nextInt();
			Employee employee=employeeService.searchEmployeeById(empId);
			System.out.println("Enter Course ID : ");
			String cId=scanner.next();
			boolean status=courseService.registerEmployeeForCourse(cId, employee);
			if(status)
				System.out.println("Employee Registered Successfully!");
			else
				System.out.println("Employee Cannot Register for Course this time");
			break;
		case 4:
			System.out.println("Enter Course ID whoes Employee Registration you want to see :");
			String courseId=scanner.next();
			Employee empls[]=courseService.listOfEmployeesForCourse(courseId);
			for(Employee emp:empls) {
				System.out.println(emp);
			}
			break;
		case 5:
			System.out.println("Thanks for using our System, kindly visit us again!");
			System.exit(0);
		default:
			System.out.println("Enter Valid Choice!");
		}

	}

}
