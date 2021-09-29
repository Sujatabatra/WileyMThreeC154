package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyThrowsDemoClass {

	public static void openFile(String fileName) throws FileNotFoundException {
		FileInputStream file=new FileInputStream(fileName);
		System.out.println("File Opened for reading");
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName=scanner.next();
		
		try {
			openFile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File "+fileName+" does not exist");
			e.printStackTrace();
		}
	}

}
