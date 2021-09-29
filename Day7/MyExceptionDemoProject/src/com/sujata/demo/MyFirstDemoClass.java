package com.sujata.demo;

import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int location=-1;
		try {
			System.out.println("Enter first no : ");
			int number1 = scanner.nextInt();
			System.out.println("Enter second no : ");
			int number2 = scanner.nextInt();

			int divide = number1 / number2;

			System.out.println("Result : " + divide);
			
			int arr[];
			System.out.println("Enter Total No of elements : ");
			int total=scanner.nextInt();
			arr=new int[total];
			
			for(int index=0;index<total;index++) {
				System.out.println("Enter Element : ");
				arr[index]=scanner.nextInt();
			}
			
			System.out.println("Enter location of an array whose value you want to display ");
			location=scanner.nextInt();
			System.out.println("ELement at location : "+location+" :" +arr[location]);

			System.out.println("Good Bye from Try Block");
		} 
		catch (ArithmeticException exception) {
			System.out.println("Infinite");
		}
		
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Location "+location+" does not exist in an array");
		}
		catch(NegativeArraySizeException exception) {
			System.out.println("Array Size cannot be negative, please try again with some positive no. ");
		}
		/*
		 * Generic Exception Handler
		 * must be the last handler 
		 */
		catch(Exception exception) {
			System.out.println("SomeThing went wrong , please try after sometime!");
		}
		System.out.println("Good Bye from main, Have a Nice Day!");

	}

}
