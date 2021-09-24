package com.sujata.demo;


class FinalDemo{
	private int value1;
	//initialise final variable at the time of declaration, otherwise compiler will give an error
	final private int value2=10;
	
	public void input(int v1,int v2) {
		value1=v1;
//		value2=v2;
	}
	
	public void demo() {
		final int x;
		x=10;
//		x=20;
		
	}
}
public class FinalVariableDemo {

	public static void main(String args[]) {
		
	}
}
