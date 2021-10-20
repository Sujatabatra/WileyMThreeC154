package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

//@SpringBootApplication =  @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class GreetSpringbootProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("goodEvening")
	private Greet greet;
	
	@Bean
	public GoodMorning goodMorning() {
		return new GoodMorning("Sanket");
	}
	public static void main(String[] args) {
		SpringApplication.run(GreetSpringbootProjectApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		greet.wish();
		
	}
	

}
