package com.sujata.demo;
/*
 * if a class has even a single me
 */
abstract public class Car {

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
	
	abstract public void engine();
}
