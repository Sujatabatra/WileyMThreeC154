package com.sujata.chario;

import java.io.FileReader;
import java.io.IOException;

public class CharFileReading {

	public static void main(String[] args) {
		
		try(FileReader fileReader=new FileReader("CharIO");){
			int ch;
			while((ch=fileReader.read())!=-1) {
				System.out.print((char)ch);
			}
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}

	}

}
