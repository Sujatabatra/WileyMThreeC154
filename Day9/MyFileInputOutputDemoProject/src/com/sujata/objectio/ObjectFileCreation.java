package com.sujata.objectio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectFileCreation {

	public static void main(String[] args) {
		try( FileOutputStream fos=new FileOutputStream("ObjectIO");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			
			Person person=new Person(101, "AAAAA");
			
			oos.writeObject(person);
			System.out.println("File Created!");
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}

	}

}
