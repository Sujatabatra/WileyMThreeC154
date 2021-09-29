package com.sujata.demo;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

public class MyMultiCatchDemoClass {

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
//		catch (ArithmeticException exception) {
//			System.out.println(exception.getMessage());
//		}
//		
//		catch(ArrayIndexOutOfBoundsException exception) {
//			System.out.println(exception.getMessage());
//		}
//		catch(NegativeArraySizeException exception) {
//			System.out.println(exception.getMessage());
//		}
//		catch(Exception exception) {
//			System.out.println(exception.getMessage());
//		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException|NegativeArraySizeException exception) {
			System.out.println(exception.getMessage());
		}
		catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
		finally {
			System.out.println("Hi I am Finally Block!");
		}
		System.out.println("Good Bye from main, Have a Nice Day!");

	}

}
