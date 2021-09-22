package com.sujata.training;

import com.sujata.demo.SecondDemoClass;

public class MyTrainingClass {
	
	public static void main(String args[]) {
		//Absolute Path of the class 
		com.sujata.demo.SecondDemoClass secondDemoClass=new com.sujata.demo.SecondDemoClass();
		secondDemoClass.functionTwo();
		
		//Relative Path , then include import
		SecondDemoClass sOb=new SecondDemoClass();
		
	}

}
