//Best TimeComplexity:O(n^2)
/* Here the bubble sort doesnt require any addition memory apart part from loop variable temp and other like flag
 * and n so therefore the Space Complexity:= O(1):
*/
package com.Algorithms.Bubble;

public class Bubble {

	
//	14,33,27,10,35
	
	void bubbleSort(int arr[]) {
		int flag=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
		if(flag==0) 
			break;
		
		}
	}
      void display(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
