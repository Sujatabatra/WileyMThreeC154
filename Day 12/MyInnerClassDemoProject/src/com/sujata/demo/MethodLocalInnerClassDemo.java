package com.sujata.demo;

class MyOuter{
	
	public void show() {
		System.out.println("Hi I am show method of MyOuter class");
		
		class Inner{
			public void display() {
				System.out.println("Hi I am display method of InnerClass which is method Local inner class");
			}
		}
		Inner ob=new Inner();
		ob.display();
	}
}
public class MethodLocalInnerClassDemo {

	public static void main(String[] args) {
		MyOuter myOuter=new MyOuter();
		myOuter.show();

	}

}
