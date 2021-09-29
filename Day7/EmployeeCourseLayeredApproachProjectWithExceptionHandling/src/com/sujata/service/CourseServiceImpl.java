package com.sujata.service;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;
import com.sujata.exceptions.CourseNotFoundException;
import com.sujata.persistence.CourseDao;
import com.sujata.persistence.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {

	private CourseDao courseDao=new CourseDaoImpl();
	
	@Override
	public Course[] getAllCoursesForEmployee() {
		
		return courseDao.getAllCourses();
	}

	@Override
	public boolean registerEmployeeForCourse(String cId,Employee employee)throws CourseNotFoundException {
		return courseDao.addEmployeeForCourseId(cId, employee);
	}

	@Override
	public boolean deregisterEmployeeForCourse(String cId,int eId) {
		
		return courseDao.deleteEmployeeForCourseId(cId, eId);
	}

	@Override
	public Employee[] listOfEmployeesForCourse(String cID)throws CourseNotFoundException {
		
		return courseDao.searchCourseById(cID).getEmployees();
	}

}
