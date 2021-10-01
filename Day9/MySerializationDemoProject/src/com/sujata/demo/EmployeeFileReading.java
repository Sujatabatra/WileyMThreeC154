package com.sujata.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeFileReading {
	
	public static void main(String args[]) {
		try(FileInputStream fis=new FileInputStream("EmployeeIO");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			Employee employee=(Employee)ois.readObject();
			
			System.out.println(employee);
		}
		catch(IOException exception) {
			exception.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
