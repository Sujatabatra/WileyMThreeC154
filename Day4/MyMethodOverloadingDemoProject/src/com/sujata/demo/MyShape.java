package com.sujata.demo;

public class MyShape {

	public int area(int length,int breadth) {
		return length*breadth;
	}
	
	public int area(int side) {
		return side*side;
	}
	
	public double area(double radius) {
		return 3.14*radius*radius;
	}
}
