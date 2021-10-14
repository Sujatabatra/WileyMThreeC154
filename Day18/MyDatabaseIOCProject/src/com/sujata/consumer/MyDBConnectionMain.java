package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Connection;

public class MyDBConnectionMain {

	public static void main(String[] args) {
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("connect.xml");
		
		Connection connection1=(Connection)springContainer.getBean("MySqlConnection");
		
		connection1.connect();

	}

}
