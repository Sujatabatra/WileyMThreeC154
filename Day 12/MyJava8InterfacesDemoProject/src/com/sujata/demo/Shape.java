package com.sujata.demo;

public interface Shape {
	public void area();
	
	default public void perimeter() {
		System.out.println("This function is not supported here");
	}

}
