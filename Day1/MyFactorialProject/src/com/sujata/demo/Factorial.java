package com.sujata.demo;

public class Factorial {
	private int number,factorial;

	private void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
}
