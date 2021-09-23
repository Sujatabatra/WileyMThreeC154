package com.sujata.training;

import com.sujata.demo.Student;

public class MyStudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(890, "Ashish");
		student.display();

		Marks marks1=new Marks();
		marks1.input(111, "Bharti", 90, 80, 65);
		marks1.displayStudentWithMarks();
	}

}
