package com.sujata.demo;

public class Car {

	private String model , color;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void engine() {
		System.out.println("Car Engine");
	}
}
