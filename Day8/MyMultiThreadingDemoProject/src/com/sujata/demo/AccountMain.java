package com.sujata.demo;

public class AccountMain {

	public static void main(String[] args) {
		Account a001=new Account();
		Account a002=new Account();
		
		Thread chetan=new Thread(a001,"Chetan");
		Thread sanjana=new Thread(a001,"Sanjana");
		
		chetan.start();
		sanjana.start();
		
		Thread shivendra=new Thread(a002,"Shivendra");
		Thread vishal=new Thread(a002,"Vishal");

		shivendra.start();
		vishal.start();
	}

}
