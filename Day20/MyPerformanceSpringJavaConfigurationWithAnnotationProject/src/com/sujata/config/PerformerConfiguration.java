package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class PerformerConfiguration {

//	@Bean("Shalini")
//	public Singer getSingle() {
//		return new Singer("Gadi Wala Aya");
//	}
//	
//	@Bean
//	public Juggler Waqar() {
//		Juggler juggler=new Juggler();
//		juggler.setBalls(20);
//		return juggler;
//	}
//	
//	@Bean("Chetan")
//	public Dancer getDancer() {
//		return new Dancer("Tandav");
//	}
//	
//	@Bean
//	public Guitar guitar() {
//		return new Guitar();
//	}
//	
//	@Bean
//	public Drum drum() {
//		return new Drum();
//	}
//	
//	@Bean
//	public Tabla tabla() {
//		return new Tabla();
//	}
//	
//	@Bean("Shafi")
//	public Instrumentalist getInstrumentalist() {
//		Instrumentalist instrumentalist=new Instrumentalist();
//		instrumentalist.setInstrument(guitar());
//		return instrumentalist;
//	}
}
