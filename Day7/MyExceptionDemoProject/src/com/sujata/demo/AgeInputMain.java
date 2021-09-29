package com.sujata.demo;

import java.util.Scanner;

public class AgeInputMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age=scanner.nextInt();
		
		AgeInput ageInput=new AgeInput();
		try {
		ageInput.inputAge(age);
		System.out.println("Age : "+age+" is eligible for voting");
		}
		catch(AgeUncheckedException exception) {
			System.out.println("Person is not eligible for voting");
		}
		
		
		try {
			ageInput.setAge(age);
			System.out.println("Person with age "+age+" is eligible to be employed");
		} catch (AgeCheckedException e) {
			
			System.out.println("Person with age "+age+" is not eligible for employment");
		}
		
	}

}
