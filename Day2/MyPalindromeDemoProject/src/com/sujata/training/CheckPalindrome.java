package com.sujata.training;

import com.sujata.demo.Reverse;

public class CheckPalindrome {

	/*
	 * Instance Variables :
	 * All instance variables gets default initial values
	 * bye,int, short, long : 0
	 * boolean : false
	 * double and float : 0.0
	 * object : null
	 */
	private int number;
	private boolean palindromeStatus;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPalindromeStatus() {
		Reverse reverse=new Reverse();
		reverse.setNumber(number);
		if(reverse.getReverseNumber()==number)
			palindromeStatus=true;
		
		return palindromeStatus;
	}
	
	
	
}
