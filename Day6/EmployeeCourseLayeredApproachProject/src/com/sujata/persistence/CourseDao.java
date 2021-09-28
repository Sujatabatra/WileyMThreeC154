package com.sujata.persistence;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;

public interface CourseDao {
	
	Course[] getAllCourses();
	Course searchCourseById(String cId);
	boolean addEmployeeForCourseId(String cID,Employee employee);

}
