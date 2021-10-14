package com.sujata.producer;

public class GoodMorning implements Greet {

	private String name;
	
	
	public GoodMorning(String name) {
		super();
		this.name = name;
	}


	@Override
	public void wish() {
		System.out.println("Good Morning "+name);

	}

}
