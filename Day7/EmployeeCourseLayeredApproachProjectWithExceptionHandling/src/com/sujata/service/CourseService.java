package com.sujata.service;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;
import com.sujata.exceptions.CourseNotFoundException;

public interface CourseService {

	Course[] getAllCoursesForEmployee();
	boolean registerEmployeeForCourse(String cId,Employee employee)throws CourseNotFoundException;
	boolean deregisterEmployeeForCourse(String cId,int eId);
	Employee[] listOfEmployeesForCourse(String cID)throws CourseNotFoundException;
}
