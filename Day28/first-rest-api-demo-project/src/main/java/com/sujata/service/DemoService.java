package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public String getMessage() {
		return "<h1>Welcome to the world of Rest API!</h1>";
	}
	
	public String greet(String name) {
		return "Welcome "+name+" !!";
	}
}
