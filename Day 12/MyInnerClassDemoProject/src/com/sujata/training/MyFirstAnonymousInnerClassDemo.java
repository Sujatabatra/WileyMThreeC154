package com.sujata.training;

class Base{
	public void show() {
		System.out.println("Hi I am show method from Base class");
	}
	
	public void display() {
		System.out.println("Hi I am display method from Base class");
	}
}
public class MyFirstAnonymousInnerClassDemo {

	public static void main(String[] args) {
		Base b=new Base();
		b.show();
		b.display();
		
		Base b1=new Base() {
			public void show() {
				System.out.println("Hi I am new show method");
			}
			
		};
		System.out.println("===================");
		b1.display();
		b1.show();

	}

}
