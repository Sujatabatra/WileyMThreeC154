package com.sujata.demo;

import java.util.Scanner;

public class ThrowDemoClass {

	
	static void divide(int number1,int number2) {
		int divide=number1/number2;
		System.out.println("Result : "+divide);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first no : ");
		int n1=scanner.nextInt();
		System.out.println("Enter second no : ");
		int n2=scanner.nextInt();
		if(n2==0)
			throw new ArithmeticException("Infinity");
		divide(n1, n2);
		
	}

}
