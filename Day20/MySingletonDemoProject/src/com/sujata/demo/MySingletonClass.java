package com.sujata.demo;

public class MySingletonClass {

	static private MySingletonClass instance;
	
	
	private MySingletonClass() {
		
	}
	
	public void show() {
		System.out.println("Hi I am show method from MySingletonClass");
	}

	public static MySingletonClass getInstance() {
		//Lazy
		if(instance==null)
			instance=new MySingletonClass();
		return instance;
	}
	
	
}

//class Derived extends MySingletonClass{
//	
//}