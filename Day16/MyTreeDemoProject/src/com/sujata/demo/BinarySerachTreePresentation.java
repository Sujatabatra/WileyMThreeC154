package com.sujata.demo;

import java.util.Scanner;

public class BinarySerachTreePresentation {

	private BinarySearchTree binarySearchTree=new BinarySearchTree();
	
	public void showMenu() {
		System.out.println("1. Add Element");
		System.out.println("2. Inorder Traversal");
		System.out.println("3. Exit");
	}
	
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		
		switch(choice) {
		case 1:
			System.out.println("Enter Element : ");
			int element=scanner.nextInt();
			binarySearchTree.insertValue(element);
			break;
		case 2:
			binarySearchTree.inorderTraversal();
			break;
		case 3:
			System.out.println("Thanks for using out system!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!");
		}
	}
}
