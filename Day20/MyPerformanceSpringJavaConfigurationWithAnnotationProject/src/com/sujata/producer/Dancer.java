package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Chetan")
public class Dancer implements Performer {

	@Value("Tandav")
	private String style;
	
	public Dancer() {
		
	}
	public Dancer(String style) {
		super();
		this.style = style;
	}


	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+style+" Style!");

	}

}
