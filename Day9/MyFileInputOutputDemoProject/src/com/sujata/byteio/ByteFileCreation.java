package com.sujata.byteio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileCreation {

	public static void main(String[] args) {
		
//		File file=new File("ByteIO");
//		FileOutputStream fos=new FileOutputStream(file);

		try (FileOutputStream fos=new FileOutputStream("ByteIO");){
			byte[] arr={'S','U','J','A','T','A','\n','D','E','L','H','I'};
			
			fos.write(arr);
			
			System.out.println("File Created!");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
