package com.Algorithms.Bubble;

import java.util.Scanner;

public class BubbleMain {

	public static void main(String[] args) {
	    {
	        Bubble bubble = new Bubble();
        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number of elements");
	        int total=sc.nextInt();
	        
	        int arr[] = new int[total];
	    System.out.println("Enter the values");
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        bubble.bubbleSort(arr);;
	        System.out.println("Sorted array");
	        bubble.display(arr);
	    }
	}
}


