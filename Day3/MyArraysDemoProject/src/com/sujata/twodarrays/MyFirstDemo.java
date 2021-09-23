package com.sujata.twodarrays;

import java.util.Scanner;

public class MyFirstDemo {

	public static void main(String[] args) {
		//declaration
		int arr[][];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter total no of columns : ");
		int cols=sc.nextInt();
		
		//Memory allocation
		arr=new int [rows][cols];
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.println("Enter element : ");
				arr[row][col]=sc.nextInt();
			}
		}

		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println(" ");
		}
	System.out.println("================");
	for(int[] ar:arr) {
		for(int element:ar) {
		System.out.print(element+" ");
		}
		System.out.println(" ");
	}
	
	}
}
