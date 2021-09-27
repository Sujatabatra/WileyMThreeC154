package com.insertionsort;

import java.util.Scanner;

public class InsertionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		InsertionSort bs = new InsertionSort(n);
		System.out.println("Enter the array Elements: ");

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			bs.insertEle(a, i);
		}

		bs.sort(bs);
		System.out.println("Printing sorted array in main: ");
		int arr[] = bs.getArr();
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.println("Printing sorted array using display method: ");
		bs.display();
		sc.close();
	}

}
