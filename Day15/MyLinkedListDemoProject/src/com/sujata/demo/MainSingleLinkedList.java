package com.sujata.demo;

import java.util.Scanner;

public class MainSingleLinkedList {

	public static void main(String[] args) {
		
		SinglyLinkedListPresentation singlyLinkedListPresentation=new SinglyLinkedListPresentation();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
		singlyLinkedListPresentation.showMenu();
		System.out.println("Enter choice : ");
		int choice=scanner.nextInt();
		singlyLinkedListPresentation.performMenu(choice);
		}

	}

}
