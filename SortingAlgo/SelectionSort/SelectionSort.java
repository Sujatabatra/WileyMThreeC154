package com.shivendra.selection;


/*
 * Time Complexity ->
 * Best Case -> O(n^2)
 * Average Case -> O(n^2)
 * Worst Case -> O(n^2)
 * 
 * Space Complexity -> O(1) (in place sorting algorithm)
*/
public class SelectionSort {
	private int []arr;
	private int size;
	SelectionSort()
	{
		size = 0;
		arr = null;
	}
	public void setSize(int size)
	{
		this.size = size;
		arr = new int[this.size];
	}
	public int[] getArr()
	{
		return arr;
	}
	public void setData(int index, int num)
	{
		arr[index] = num;
	}
	public int getData(int index)
	{
		return arr[index];
	}
	public void selectionSort()
	{
		int i;
		int j;
		int temp;
		for(i = 0; i < size; i ++)
		{
			int minIndex = i;
			for(j = i + 1; j < size; j ++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}	
}
