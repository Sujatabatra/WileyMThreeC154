package com.sujata.demo;

public class Audi extends Car {

	public Audi() {

	}

	public Audi(String model, String color) {
		super(model, color);

	}

	@Override
	public void engine() {
		System.out.println("Audi engine goes AOOM");

	}

}
