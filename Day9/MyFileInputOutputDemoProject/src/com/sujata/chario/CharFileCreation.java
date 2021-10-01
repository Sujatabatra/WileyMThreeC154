package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class CharFileCreation {

	public static void main(String[] args) {
		
		try(FileWriter fileWriter=new FileWriter("CharIO");){
			String data="Hello Everyone!! ,\n Demonstrating Char File IO";
			
			fileWriter.write(data);
			
			System.out.println("File Created!");
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}

	}

}
