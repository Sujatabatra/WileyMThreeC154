package com.sujata.demo;

public class MainDemoVarArg {

	public static void main(String args[]) {
		MyDemoVarArgs myDemoVarArgs=new MyDemoVarArgs();
		
		System.out.println("Sum of three integers "+myDemoVarArgs.sum(10,20,30));
		
		System.out.println("Sum of five integers "+myDemoVarArgs.sum(1,2,3,4,5));
	}
}
