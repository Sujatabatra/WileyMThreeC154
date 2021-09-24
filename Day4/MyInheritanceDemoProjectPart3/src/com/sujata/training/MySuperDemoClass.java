package com.sujata.training;

class Base
{
	int i=5;
	void show() {
		System.out.println("Hi i am show method from Base Class");
	}
}

class Derived extends Base{
	
	int i=10;
	void show() {
		System.out.println("Base class i : "+super.i);
		System.out.println("Derived class i : "+i);
	}
	
}
public class MySuperDemoClass {

	public static void main(String[] args) {
		Base base=new Base();
		base.show();
		System.out.println("i : "+base.i);
		
		System.out.println("====================");
		Derived derived=new Derived();
		derived.show();
		System.out.println("====================");
		base=new Derived();
		base.show();
		System.out.println(" i : "+base.i); //variables are not over ridden so base class i will only be accessible
		System.out.println("i : "+((Derived)(base)).i);
		
		
		
		

	}

}
