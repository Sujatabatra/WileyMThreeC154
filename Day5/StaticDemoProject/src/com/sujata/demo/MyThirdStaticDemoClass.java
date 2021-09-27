package com.sujata.demo;

class Base{
	int x=10;
	static int y=20;
	
	public static void dummy() {
		System.out.println("Hello from Base and value of y :"+y);
	}
}

class Derived extends Base{
	int x=20;
	static int y=15;
	
	public static void dummy() {
		System.out.println("Hello from Derived");
	}
	public static void display() {
		System.out.println("Base y "+Base.y);
//		System.out.println("Base y "+super.y);
		System.out.println("Derived y "+y);
	}
	public void show() {
		System.out.println("Base x "+super.x);
		System.out.println("Derived x "+x);	
	}
}
public class MyThirdStaticDemoClass {

	public static void main(String[] args) {
		Derived.display();
		Base.dummy();
		Derived.dummy();
		System.out.println("==================");
		Base b=new Base();
		b.dummy();
		Derived d=new Derived();
		d.dummy();
		
		b=new Derived();
		b.dummy();

	}

}
