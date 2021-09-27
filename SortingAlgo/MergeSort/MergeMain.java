package com.banu.merge;

import java.util.Scanner;

import com.banu.insertion.Insertion;

public class MergeMain {

	public static void main(String[] args) {
		
		Merge merge = new Merge();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int total = sc.nextInt();

		int arr[] = new int[total];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		merge.mergeSort(arr,0,total-1);
		
		System.out.println("Sorted array");
		merge.display(arr);
	}
}
