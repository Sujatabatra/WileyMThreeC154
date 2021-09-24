package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;

//	public Grade() {
//		//by default giving the call to base class default constructor : super()
//		super(10,20,30);
//		System.out.println("Hi I am Grade Default Constructor");
//	}

	public double getPercentage() {
		this.percentage = (getMarks1() + getMarks2() + getMarks3()) / 3;
		return percentage;
	}

	public Grade(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name, marks1, marks2, marks3);

	}

	public String getGrade() {
		if (percentage > 75)
			grade = "A Grade";
		else
			grade = "B Grade";
		return grade;
	}

	public void display() {
		super.display();
		System.out.println("Percentage : " + getPercentage());
		System.out.println("Grade : " + getGrade());
	}

}
