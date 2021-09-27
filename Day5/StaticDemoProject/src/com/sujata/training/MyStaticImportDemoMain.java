package com.sujata.training;
/*
 * import all the static members of the specified class
 */
import static com.sujata.demo.MyStaticImportDemoClass.*;

import com.sujata.demo.MyStaticImportDemoClass;

public class MyStaticImportDemoMain {

	public static void main(String[] args) {
//		MyStaticImportDemoClass.methodTwo();
//		
//		MyStaticImportDemoClass.methodFour();
//		
//		MyStaticImportDemoClass.methodFive();

		methodTwo();
		methodFive();
		methodFour();
		
		/*
		 * if you want to create object of the class 
		 * whoes static members have been imported
		 * you need to import that class
		 * in non static way too
		 */
		
		MyStaticImportDemoClass sOb=new MyStaticImportDemoClass();
	}

}
