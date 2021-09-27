package com.insertionsort;


public class InsertionSort {
	private int n;
	private int[] arr;

	public InsertionSort(int n) {
		super();
		this.n = n;
		arr = new int[n];
	}

	public InsertionSort(int n, int[] arr) {
		this.arr = arr;
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public int[] getArr() {
		return arr;
	}

	public void insertEle(int ele, int ind) {
		this.arr[ind] = ele;
	}

	public InsertionSort sort(InsertionSort b) {
		for (int i = 1; i < n; ++i) {
            int key = b.arr[i];
            int j = i - 1;
            while (j >= 0 && b.arr[j] > key) {
                b.arr[j + 1] = b.arr[j];
                j = j - 1;
            }
            b.arr[j + 1] = key;
        }
		return b;
	}

	public void display() {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
}

//Space Complexity - O(1)

//Time Complexity - 
//Best Case - O(n)
//Worst and Average Case - O(n^2)