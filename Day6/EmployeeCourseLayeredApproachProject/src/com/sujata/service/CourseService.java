package com.sujata.service;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;

public interface CourseService {

	Course[] getAllCoursesForEmployee();
	boolean registerEmployeeForCourse(String cId,Employee employee);
	boolean deregisterEmployeeForCourse();
	Employee[] listOfEmployeesForCourse(String cID);
}
