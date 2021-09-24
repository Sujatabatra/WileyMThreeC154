package com.sujata.demo;

public class MyNumber {

	private int number;
	private int result;
	
	public MyNumber(int number) {
		this.number=number;
	}

	public int getResult() {
		result=1;
		while(number>=1)
			result*=number--;
		return result;
	}
	
	
}
