package com.sujata.producer;

public class Dancer implements Performer {

	private String style;

	public Dancer() {
		System.out.println("1. Dancer default Constructor");
	}

	public Dancer(String style) {
		super();
		System.out.println("1. Dancer Constructor");
		this.style = style;
	}

	
	public void setStyle(String style) {
		System.out.println("2. Setter method of Dancer");
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in " + style + " Style!");

	}

}
