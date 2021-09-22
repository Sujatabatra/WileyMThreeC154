package com.sujata.demo;

public class Reverse {

	private int number,reverseNumber;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverseNumber() {
		reverseNumber=0;
		while(number!=0) {
			int remainder=number%10;
			reverseNumber=reverseNumber*10+remainder;
			number=number/10;
		}
		return reverseNumber;
	}
	
	
}
