package com.sujata.demo;

@FunctionalInterface
interface Shape{
	public void area();
}

public class MyFirstClass {

	public static void main(String[] args) {
		int x=20;
		double y=78.9;
		
		boolean flag=true;
		/*
		 * with JDK 1.8 , variables can store methods
		 * 1. datatype of method type variable
		 */
		Shape shape=new Shape() {
			public void area() {
				System.out.println("Hi I am rectangle Area");
			}
		};
		
		Shape rec=()-> {
			System.out.println("Hi I am rectangle Area");
		};
		
		rec.area();

	}

}
