package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoodEvening implements Greet {

	private String name;

	@Value("Chetan")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Evening " + name);

	}

}
