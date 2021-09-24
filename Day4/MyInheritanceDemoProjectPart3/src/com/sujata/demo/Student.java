package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;
	
	
//	public Student() {
//		System.out.println("Hi I am Student Default Constructor");
//	}
	
	
	public void input(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}

	public void display() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	
	
}
