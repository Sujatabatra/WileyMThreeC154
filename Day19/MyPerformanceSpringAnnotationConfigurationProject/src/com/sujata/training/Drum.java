package com.sujata.training;

import org.springframework.stereotype.Component;

@Component
public class Drum implements Instrument {

	@Override
	public void play() {
		System.out.println("Dum Dum Dum");

	}

}
