package com.sujata.demo;

import java.util.Scanner;

public class MainGraph {

	public static void main(String[] args) {
		GraphPresentation graphPresentation=new GraphPresentation();
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			graphPresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			graphPresentation.performMenu(choice);
		}

	}

}
