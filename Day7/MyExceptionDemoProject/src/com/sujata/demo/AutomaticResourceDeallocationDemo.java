package com.sujata.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AutomaticResourceDeallocationDemo {

	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name ");
		String fileName=scanner.next();
		/*
		 * FileInputStream class is used to read the content of a file
		 */
		/*
		 * Automatic Resource Deallocation = JDK 1.7
		 * i.e if we are opening any resource like below with try, we need not to deallocated it
		 * automatic deallocation happens
		 */
		try(FileInputStream file=new FileInputStream(fileName)) {
		
			System.out.println(fileName+" opened for reading");
		} catch (FileNotFoundException e) {
			
			System.out.println("File "+fileName+" does not exist");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
	}
}
