package com.sujata.training;

interface Shape{
	public void area();
}
public class MySecondAnonymousInnerClassDemo {

	public static void main(String[] args) {
		Shape rectangle=new Shape() {
			
			@Override
			public void area() {
				System.out.println("Hi I am Rectangle Area");
				
			}
		};
		
		rectangle.area();
	}

}
