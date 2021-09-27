package com.sujata.demo;

public class CalculateArea {

	private Shape shape;

	public CalculateArea(Shape shape) {
		super();
		this.shape = shape;
	}
	
	public void getArea() {
		shape.area();
		shape.display();
	}
}
