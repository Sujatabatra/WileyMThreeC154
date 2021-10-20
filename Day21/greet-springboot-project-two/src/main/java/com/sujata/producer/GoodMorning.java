package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class GoodMorning implements Greet {

	private String name;

	
	public GoodMorning(/*@Value("Leena")*/ String name) {
		super();
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Morning " + name);
	}

}
