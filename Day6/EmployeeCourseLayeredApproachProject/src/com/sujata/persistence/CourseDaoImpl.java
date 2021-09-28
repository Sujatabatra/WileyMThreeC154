package com.sujata.persistence;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;
import com.sujata.database.CourseDataBase;

public class CourseDaoImpl implements CourseDao {

	private CourseDataBase courseDataBase=new CourseDataBase();
	
	@Override
	public Course[] getAllCourses() {
		return courseDataBase.getCourses();
	}

	@Override
	public Course searchCourseById(String cId) {
		for(Course course:courseDataBase.getCourses()) {
			if(course.getCourseId().equals(cId))
				return course;
		}
		return null;
	}

	@Override
	public boolean addEmployeeForCourseId(String cID, Employee employee) {
		int index=0;
		Course[] courses=courseDataBase.getCourses();
		for(Course course:courses) {
			if(course.getCourseId().equals(cID)) {
				Employee[] employees=courses[index].getEmployees();
				
				employees[course.getEmpCount()]=employee;	
				courses[index].setEmployees(employees);
				
				int count=courses[index].getEmpCount();
				courses[index].setEmpCount(count+1);
				
				return true;
			}
			index++;
		}
		return false;
	}

}
