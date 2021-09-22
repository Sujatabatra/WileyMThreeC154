package com.sujata.demo;

import java.util.Scanner;

/*
 * default import is of java.lang
 */
public class UserInputDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String na=scanner.next();
		System.out.println("Enter years of experience : ");
		int exp=scanner.nextInt();
		System.out.println(na+" has experience of "+exp+" years");

	}

}
