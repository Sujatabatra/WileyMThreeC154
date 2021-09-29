package com.sujata.demo;

/*
 * User defined UnChecked exception(i.e Compiler will not force to check exception : as parent class is RunTimeException)
 */
public class AgeUncheckedException extends RuntimeException{
	
	public AgeUncheckedException(String message) {
		super(message);
	}

}
