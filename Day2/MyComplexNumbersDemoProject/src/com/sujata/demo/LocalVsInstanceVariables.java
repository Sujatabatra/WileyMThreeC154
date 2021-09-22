package com.sujata.demo;
/*
 * All instance variabled gets default initial values
 * but all local variable don't get default intial values
 * so before using any local variable , we must need to initialise it,
 * otherwise compiler will report an error
 */
class Demo{
	private int value1;
	private String str;
	private double value2;
	
	public void display() {
		int val=10 ;
		Integer iVal=new Integer("Sujata10");
		
		
		
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("str : "+str);
		System.out.println(" val : "+val);
	}
}
public class LocalVsInstanceVariables {

	public static void main(String args[]) {
		Demo d=new Demo();
		d.display();
	}
}
