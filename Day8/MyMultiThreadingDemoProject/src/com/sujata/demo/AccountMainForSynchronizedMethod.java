package com.sujata.demo;

public class AccountMainForSynchronizedMethod {

	public static void main(String[] args) {
		AccountForSynchronizedMethod a001=new AccountForSynchronizedMethod();
		AccountForSynchronizedMethod a002=new AccountForSynchronizedMethod();
		
		Thread chetan=new Thread(a001,"Chetan");
		Thread sanjana=new Thread(a001,"Sanjana");
		
		chetan.start();
		sanjana.start();
		

	}

}
