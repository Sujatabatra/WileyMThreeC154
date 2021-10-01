package com.sujata.demo;

/*
 * IS-A Relationship
 */
public class Toyota extends Car {

	public Toyota() {

	}

	public Toyota(String model, String color) {
		super(model, color);

	}

	@Override
	public void engine() {
		System.out.println("Toyota engine goes TOOM");

	}

}
