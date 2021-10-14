package com.sujata.demo;

import com.sujata.exception.NegativeNoNotAllowedException;

public class MyDivide {
	
	/*
	 * we need to divide two positive nos.
	 * if any of the no is negative out system should throw exception NegativeNoNot allowed
	 * if denominator is zero we should get the exception ArithmeticException
	 */
	public int divide(int number1,int number2) {
		if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNoNotAllowedException("Please Enter Positive No");
	}

}
