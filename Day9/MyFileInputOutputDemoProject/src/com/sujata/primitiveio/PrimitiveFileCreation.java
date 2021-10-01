package com.sujata.primitiveio;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveFileCreation {

	public static void main(String[] args) {
		
		FileOutputStream  fileOutputStream=null;
		DataOutputStream dos=null;
		try {
			fileOutputStream=new FileOutputStream("PrimitiveIO");
			dos=new DataOutputStream(fileOutputStream);
			
			dos.writeBoolean(true);
			dos.writeDouble(23.5);
			dos.writeInt(78);
			dos.write((char)65);
			
			System.out.println("File Created");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				dos.close();
				fileOutputStream.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
