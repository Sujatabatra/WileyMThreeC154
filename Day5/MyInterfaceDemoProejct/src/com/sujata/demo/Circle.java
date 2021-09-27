package com.sujata.demo;

public class Circle implements Shape {

	double radius,area;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		area=3.14*radius*radius;
	}

	@Override
	public void display() {
		System.out.println(" Area of Circle : "+area);

	}

}
