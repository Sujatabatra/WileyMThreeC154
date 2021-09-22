package com.sujata.demo;

public class BoxingAndUnboxingDemo {

	public static void main(String[] args) {
		Integer iOb1=new Integer(10);
		Integer iOb2=new Integer(20);
		/*
		 * Till JDK1.4 , while opting for calculation we need to box and unbox wrapper types
		 * xxxValue() : converting wrapper to primitive
		 * valueOf() : converting primitive to wrapper
		 */
		int i=iOb1.intValue();
		int j=iOb2.intValue();
		int s=i+j;
		Integer sumOb=Integer.valueOf(s);
		/*
		 * auto(automatic) boxing and unboxing
		 */
		Integer sum=iOb1+iOb2;

	}

}
