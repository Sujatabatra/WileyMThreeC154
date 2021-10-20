package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

//@SpringBootApplication =  @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class GreetSpringbootProjectApplication {

	@Bean
	public GoodMorning goodMorning() {
		return new GoodMorning("Sanket");
	}
	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(GreetSpringbootProjectApplication.class, args);
		Greet greet=(Greet)springContainer.getBean("goodMorning");
		greet.wish();
	}
	

}
