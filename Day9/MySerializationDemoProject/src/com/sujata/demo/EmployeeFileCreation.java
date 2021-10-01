package com.sujata.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeFileCreation {

	public static void main(String[] args) {
		try( FileOutputStream fos=new FileOutputStream("EmployeeIO");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			
			Employee employee=new Employee(101, "ABC", "IT");
			
			oos.writeObject(employee);
			System.out.println("File Created!");
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}

	}

}
