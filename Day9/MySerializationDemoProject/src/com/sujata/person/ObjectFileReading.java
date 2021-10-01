package com.sujata.person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectFileReading {
	
	public static void main(String args[]) {
		try(FileInputStream fis=new FileInputStream("ObjectIO");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			Person person=(Person)ois.readObject();
			System.out.println(person);
		}
		catch(IOException exception) {
			exception.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
