package com.sujata.demo;

class DemoStaticBlock{
	/*
	 * static block is called only once at class loading time
	 */
	static {
		System.out.println("Hi I am static block from DemoStaticBlock Class");
	}
	
	/*
	 * instance block will get called before every constructor call
	 */
	{
		System.out.println("Hi I am instance block from DemoStaticBlock Class");
	}
	/*
	 * constructor get called everytime at object creation time
	 */
	DemoStaticBlock(){
		System.out.println("Hi I am constructor of Demo Static Block");
	}
	static {
		System.out.println("Hi I am second static block from DemoStaticBlock Class");
	}
	
	
	static {
		System.out.println("Hi I am third static block from DemoStaticBlock Class");
	}
	
	{
		System.out.println("Hi I am second instance block from DemoStaticBlock Class");
	}
	
	{
		System.out.println("Hi I am third instance block from DemoStaticBlock Class");
	}
}
public class MyStaticBlockDemoClass {

	public static void main(String[] args) {
		DemoStaticBlock dOb=new DemoStaticBlock();

	}

}
