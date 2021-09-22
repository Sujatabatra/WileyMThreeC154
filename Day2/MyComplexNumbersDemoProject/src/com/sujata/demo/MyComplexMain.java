package com.sujata.demo;

public class MyComplexMain {

	public static void main(String[] args) {
		ComplexNumber number1=null;  //reference variable which is pointing to null
		number1=new ComplexNumber();
		
		/*
		 * if anytime we call any of the instance method or variable from null reference,
		 * we get NullPointerException
		 */
//		number1.setReal(10);
//		number1.setImag(-5);
		number1.display();

	}

}
