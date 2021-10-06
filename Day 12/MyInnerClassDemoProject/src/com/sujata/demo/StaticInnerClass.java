package com.sujata.demo;


class OuterClass{
	static public void show() {
		System.out.println("Hi I am show method of OuterClass");
	}
	
	static class InnerClass{
		public void display() {
			System.out.println("Hi I am display method of InnerClass");
		}
		public void demo() {
			show();
		}
	}
	
	public void print() {
//		display();
		InnerClass ob=new InnerClass();
		ob.display();
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		OuterClass.InnerClass obj=new OuterClass.InnerClass();
		obj.display();

	}

}
