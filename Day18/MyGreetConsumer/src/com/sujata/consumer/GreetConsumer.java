package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

public class GreetConsumer {

	public static void main(String[] args) {
		
		//Greet greet=new GoodMorning();
		
//		greet.wish("Sujata");
		
		//classpath : path wrt src folder in our project
		Resource resource=new ClassPathResource("greet.xml");
		/*
		 * Spring container will instantiate component and will maintain the life cycle too
		 */
		BeanFactory springContainer=new XmlBeanFactory(resource);
		
		Greet greet=(Greet)springContainer.getBean("eve");
		greet.wish("Sujata");

	}

}
