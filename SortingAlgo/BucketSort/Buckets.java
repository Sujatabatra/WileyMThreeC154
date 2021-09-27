package sorts;

import java.util.Scanner;

public class Buckets 
{
	public static void main(String[] args)
	   {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter no. of elements:");
		  int n=sc.nextInt();
		  //int []arr=new int[n];
		  float []arr=new float[n];
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("Enter number:");
			  arr[i]=sc.nextFloat();
		  }
		 System.out.println("Enter num of buckets");
		 int nBuckets=sc.nextInt();
		 
		 BucketSort buckSort=new BucketSort();
		 buckSort.bucketSort(arr, nBuckets);
		 System.out.println("Elements after bucketSort are:");
		 buckSort.display(arr, n);
	   }

}
