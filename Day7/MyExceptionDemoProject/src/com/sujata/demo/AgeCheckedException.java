package com.sujata.demo;

/*
 * User defined Checked exception(i.e Compiler will force to check exception : as parent class is Exception)
 */
public class AgeCheckedException extends Exception {

	public AgeCheckedException(String message) {
		super(message);
	}
}
