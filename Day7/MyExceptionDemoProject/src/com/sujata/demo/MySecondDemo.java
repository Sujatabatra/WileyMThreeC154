package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MySecondDemo {

	static void divide(int number1,int number2) {
		try {
			int div=number1/number2;
			System.out.println("Result : "+div);
			return;
		}
		catch(NullPointerException exception) {
			System.out.println("Infinity");
		}
		finally {
			System.out.println("Hi I am finally Block");
		}
		System.out.println("Good Bye from divide!");
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
		System.out.println("Enter First No : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second No : ");
		int number2=scanner.nextInt();
		
		divide(number1, number2);
		}
		catch(ArithmeticException exception) {
			System.out.println("Inifinity");
		}
		catch(InputMismatchException exception) {
			System.out.println("Some thing went wrong, please try after sometime");
		}

	}

}
