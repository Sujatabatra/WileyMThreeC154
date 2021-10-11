package com.sujata.demo;

import java.util.Scanner;

public class SinglyLinkedListPresentation {

	private SingleLinkedList singleLinkedList=new SingleLinkedList();
	public void showMenu() {
		System.out.println("1. Add element to Linked List");
		System.out.println("2. Traverse Linked List");
		System.out.println("3. Deleting data fron  List");
		System.out.println("4. Exit");
	}
	
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			System.out.println("Enter Element : ");
			int element=scanner.nextInt();
			singleLinkedList.insert(element);
			break;

		case 2:
			singleLinkedList.traverse();
			break;
		case 3:
			System.out.println("Enter Element to be deleted : ");
			int elemt=scanner.nextInt();
			singleLinkedList.delete(elemt);
			break;
		case 4:
			System.out.println("Thanks for Using out System");
			System.exit(0);
		default:
			break;
		}
	}
}
