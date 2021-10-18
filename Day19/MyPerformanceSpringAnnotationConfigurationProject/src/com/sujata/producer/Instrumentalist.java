package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sujata.training.Instrument;

@Component("Shafi")
public class Instrumentalist implements Performer {

	@Autowired
	@Qualifier("tabla")
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();

	}

}
