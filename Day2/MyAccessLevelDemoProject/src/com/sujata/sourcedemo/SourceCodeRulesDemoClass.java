package com.sujata.sourcedemo;

/*
 * Source code is .java file
 * 1. every java file starts with one package statement
 * 2. package statement can be followed by any no of import statements
 * 3. import statements can be followed by any no of class definations
 * 3.1 in a Single Source file we can have only one public class and rest classes as default
 * 3.2 name of the .java file should match with the name of public class
 * 3.3 in a Single Source file we can have all default classes then no naming rule is applicable to .java file
 * 3.4 main() method should always be in public class
 * 
 */
public class SourceCodeRulesDemoClass {
	
	void dummy() {
		System.out.println("dummy method");
	}
	public static void main(String args[]) {
		System.out.println("Hi I am main");
	}
}

class OneMoreClass{
	void dummy() {
		System.out.println("dummy method");
	}
	
//	public static void main(String args[]) {
//		System.out.println("Hi I am main");
//	}
}
