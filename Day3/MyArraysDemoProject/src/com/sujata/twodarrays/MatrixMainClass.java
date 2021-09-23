package com.sujata.twodarrays;

import java.util.Scanner;

public class MatrixMainClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter total no. of rows : ");
		int rows=scanner.nextInt();
		System.out.println("Enter total no. of Columns : ");
		int cols=scanner.nextInt();
		
		Matrix matrix=new Matrix(rows, cols);
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.println("Enter Element : ");
				int ele=scanner.nextInt();
				
				matrix.inputValue(ele, row, col);
						
			}
		}
		
		for(int[] ar:matrix.getMatrix()) {
			for(int element:ar) {
			System.out.print(element+" ");
			}
			System.out.println(" ");
		}

	}

}
