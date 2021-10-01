package com.sujata.primitiveio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class PrimitiveFileReading {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("PrimitiveIO");
				DataInputStream dis=new DataInputStream(fis);){
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.read());
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}

	}

}
