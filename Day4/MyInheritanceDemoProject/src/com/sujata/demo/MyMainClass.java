package com.sujata.demo;

public class MyMainClass {

	public static void main(String[] args) {
		Student student=new Student();
		
		student.input(111, "AAAA");
		student.display();
		System.out.println("==============");

		Marks marks=new Marks();
		marks.input(101, "Bhanu", 90, 80, 56);
		marks.display();
		
		/*
		 * Dynamic Method Dispatch 
		 * Base class reference variables are type compatible with derived class,
		 * but reverse is not true
		 */
		
		//Base Class Reference Variable
		Student st;
		
//		st=new Student();
		
		st=new Marks();
		st.input(10, "Shivendra");
		/*
		 * Dynamic Polymorphism
		 * or
		 * Run Time Polymorphism
		 * or
		 * Late Polymorphism
		 */
		st.display();
	}

}
