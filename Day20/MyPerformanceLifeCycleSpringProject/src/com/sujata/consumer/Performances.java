package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class Performances {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
//		Performer performer1=(Performer)springContainer.getBean("Vishnu");
//		performer1.perform();
		
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		springContainer.registerShutdownHook();
		
		Performer performer1=(Performer)springContainer.getBean("Vishnu");
		performer1.perform();
		System.out.println("========================");
		
		
		
		

	}

}
