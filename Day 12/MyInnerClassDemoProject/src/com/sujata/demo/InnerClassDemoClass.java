package com.sujata.demo;

class Outer{
	
	private int i;
	public void show() {
		System.out.println("Hi I am show method from Outer class");
	}
	/*Inner Class*/
	class Inner{
		private int j;
		public void display() {
			System.out.println("Hi I am display method from Inner class");
		}
		public void print() {
			show();
			i=20;
			
		}
	}
	
	private void dummy() {
//		display();
		Inner ob=new Inner();
		ob.display();
		ob.j=20;
	}
}
public class InnerClassDemoClass {

	public static void main(String[] args) {
		Outer outer=new Outer();
		
		Outer.Inner inner= outer.new Inner();
		inner.display();

	}

}
