package com.sujata.demo;

public class Rectangle implements Shape {

	private int length,breadth,area;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		area=length*breadth;

	}

	@Override
	public void display() {
		System.out.println("Area of Rectangle : "+area);

	}

}
