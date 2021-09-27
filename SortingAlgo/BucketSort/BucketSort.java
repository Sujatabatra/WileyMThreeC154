package sorts;
/*
 * Best Time Complexity : O(n)
 * Worst Time Complexity: O(n2) using Insertion Sort
 * O(n log n) using Comparison sort Algorithms
 */

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort 
{
	void bucketSort(int arr[],int numOfbuckets)
	{
		int n=arr.length;
		int max_val=arr[0];
		for(int i=1;i<n;i++)
			max_val=Math.max(max_val, arr[i]);
		max_val++;
		ArrayList<ArrayList<Integer>> bucket=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<numOfbuckets;i++)
			bucket.add(new ArrayList<Integer>());
		for(int i=0;i<n;i++)
		{	int buck_idx=(numOfbuckets*arr[i])/max_val;
			bucket.get(buck_idx).add(arr[i]);
		}
		for(int i=0;i<numOfbuckets;i++)
			Collections.sort(bucket.get(i));
		int index=0;
		for(int i=0;i<numOfbuckets;i++)
			for(int j=0;j<bucket.get(i).size();j++)
				arr[index++]=bucket.get(i).get(j);
	 
	}
	void bucketSort(float arr[],int numOfbuckets)
	{
		int n=arr.length;
		float max_val=arr[0];
		for(int i=1;i<n;i++)
			max_val=Math.max(max_val, arr[i]);
		max_val++;
		ArrayList<ArrayList<Float>> bucket=new ArrayList<ArrayList<Float>>();
		for(int i=0;i<numOfbuckets;i++)
			bucket.add(new ArrayList<Float>());
		for(int i=0;i<n;i++)
		{	int buck_idx=(int) ((numOfbuckets*arr[i])/max_val);
			bucket.get(buck_idx).add(arr[i]);
		}
		for(int i=0;i<numOfbuckets;i++)
			Collections.sort(bucket.get(i));
		int index=0;
		for(int i=0;i<numOfbuckets;i++)
			for(int j=0;j<bucket.get(i).size();j++)
				arr[index++]=bucket.get(i).get(j);
	 
	}
	void display(float arr[],int n)
	   {
		   for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
	   }
	void display(int arr[],int n)
	   {
		   for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
	   }
	

}
