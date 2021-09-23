package com.sujata.onedarrays;

import java.util.Scanner;

public class MyFirstDemo {
	
	public static void main(String args[]) {
		//array Declaration
		int arr[];
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter total no of elements in an array : ");
		int total=scanner.nextInt();
		
		//Memory allocation
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter "+(index+1)+" element : ");
			arr[index]=scanner.nextInt();
		}
		
		for(int index=0;index<total;index++) {
			System.out.println(arr[index]);
		}
		System.out.println("=================");
		for(int element:arr) {
			System.out.println(element);
		}
	}

}
