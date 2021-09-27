package com.sujata.demo;

public class MainCalculateShape {

	public static void main(String args[]) {
		CalculateArea calculateArea=new CalculateArea(new Circle(3.8));
		calculateArea.getArea();
	}
}
