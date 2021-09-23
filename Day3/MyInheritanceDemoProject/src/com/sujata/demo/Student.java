package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;
	
	public void input(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
	}
}
