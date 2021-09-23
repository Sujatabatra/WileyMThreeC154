package com.sujata.twodarrays;

public class Matrix {

	private int matrix[][];
	private int rows,cols;
	public Matrix(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		matrix=new int[rows][cols];
	}
	
	public void inputValue(int value,int rowLocation,int colLocation) {
		matrix[rowLocation][colLocation]=value;
	}

	public int[][] getMatrix() {
		return matrix;
	}
	
	public void displayMatrix() {
		for(int[] ar:matrix) {
			for(int element:ar) {
			System.out.print(element+" ");
			}
			System.out.println(" ");
		}
	}
	
	
}
