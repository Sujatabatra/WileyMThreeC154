package com.sujata.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyCheckedExceptionDemo {

	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name ");
		String fileName=scanner.next();
		/*
		 * FileInputStream class is used to read the content of a file
		 */
		FileInputStream file=null;
		try {
			file=new FileInputStream(fileName);
			System.out.println(fileName+" opened for reading");
		} catch (FileNotFoundException e) {
			
			System.out.println("File "+fileName+" does not exist");
		}
		finally {
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
