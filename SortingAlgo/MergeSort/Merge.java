package com.banu.merge;

/* TIME COMPLEXITY
 * Best case: O(n log n)
 * Average Case:O(n log n)
 * Worst Case:O(n log n)
 * Space Complexity: O(n)
 * 
 */
public class Merge {

	void mergeSort(int arr[], int beg, int end) {
		
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(arr, beg, mid); //lefthalf
			
			mergeSort(arr, mid + 1, end); //righthalf
			
			merge(arr, beg, mid, end);
		}
	}

	void merge(int arr[], int beg, int mid, int end) {

		int l = mid - beg + 1;
		int r = end - mid;

		int LeftArray[] = new int[l];
		int RightArray[] = new int[r];

		for (int i = 0; i < l; ++i)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < r; ++j)
			RightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = beg;
		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
