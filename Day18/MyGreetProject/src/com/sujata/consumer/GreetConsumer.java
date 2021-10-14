package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

public class GreetConsumer {

	public static void main(String[] args) {
		
		/*
		 * IOC : Inversion of Control : Seperating the depedency logic from the actual logic of an application : to completely loosley coupled our system
		 * we achieve IOC withb the help of Depedency Injection
		 * two kind of depedency injection
		 * 1. Constructor Injection
		 * 2. Setter Injection
		 */
		Resource resource=new ClassPathResource("greet.xml");
		/*
		 * Spring container will instantiate component(calling the default constructor) and will maintain the life cycle(1. constructor call, 2. Setter) too
		 */
		BeanFactory springContainer=new XmlBeanFactory(resource);
		
		Greet greet=(Greet)springContainer.getBean("eve");
		greet.wish();

	}

}
