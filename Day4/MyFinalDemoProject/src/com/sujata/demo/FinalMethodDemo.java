package com.sujata.demo;

class MyBase{
	public void demo() {
		System.out.println("Hi I am demo from Base");
	}
	
	final public void dummy() {
		System.out.println("Hi I am dummy from Base");
	}
}

class MyDerived extends MyBase{
	public void demo() {
		System.out.println("Hi I am demo from Base");
	}
	
//	public void dummy() {
//		System.out.println("Hi I am dummy from Base");
//	}
}
public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
