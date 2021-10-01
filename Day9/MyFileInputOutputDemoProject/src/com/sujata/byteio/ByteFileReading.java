package com.sujata.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteFileReading {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("ByteIO");) {
			
			int ch;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}

		} catch (FileNotFoundException exception) {

		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
