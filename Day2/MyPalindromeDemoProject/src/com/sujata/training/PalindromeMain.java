package com.sujata.training;

public class PalindromeMain {

	public static void main(String[] args) {
		CheckPalindrome checkPalindrome=new CheckPalindrome();
		int number=123434;
		checkPalindrome.setNumber(number);
		System.out.println("Palindrome Status : "+checkPalindrome.isPalindromeStatus());

		if(checkPalindrome.isPalindromeStatus())
			System.out.println("No is Palindrome");
		else
			System.out.println("No is not Palindrome");
	}

}
