package com.sujata.demo;

import java.util.Scanner;

public class MainBinarySearchTree {

	public static void main(String[] args) {
		BinarySerachTreePresentation binarySerachTreePresentation=new BinarySerachTreePresentation();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			binarySerachTreePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			binarySerachTreePresentation.performMenu(choice);
		}

	}

}
