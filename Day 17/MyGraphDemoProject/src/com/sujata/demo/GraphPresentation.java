package com.sujata.demo;

import java.util.Scanner;

public class GraphPresentation {

	private Graph graph=new Graph();
	public void showMenu() {
		System.out.println("1. Enter Element ");
		System.out.println("2. Show Graph");
		System.out.println("3. Exit");
	}
	
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			System.out.println("Enter Source : ");
			String source=scanner.next();
			System.out.println("Enter Destination : ");
			String destimation=scanner.next();
			System.out.println("Bidirectional : (true/false) : ");
			boolean bidirectional=scanner.nextBoolean();
			graph.addNewEdge(source, destimation, bidirectional);
			break;
		case 2:
			System.out.println(graph);
			break;
		case 3:
			System.out.println("Thanks for using our System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
	}
}
