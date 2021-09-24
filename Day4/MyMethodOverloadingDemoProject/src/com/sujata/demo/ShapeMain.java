package com.sujata.demo;

/*
 * Compile Time polymorphism
 * or
 * Static Binding
 * or
 * Early Binding
 */
public class ShapeMain {

	public static void main(String[] args) {
		MyShape myShape=new MyShape();
		
		System.out.println("Area of Recatngle : "+myShape.area(7, 4));

		System.out.println("Area of Square : "+myShape.area(6));
		
		System.out.println("Area of Circle : "+myShape.area(5.4));
		
	}

}
