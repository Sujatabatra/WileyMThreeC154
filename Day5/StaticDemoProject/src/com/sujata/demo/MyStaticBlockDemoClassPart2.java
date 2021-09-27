package com.sujata.demo;

class BaseClassStaticBlock{
	
	static {
		System.out.println("Hi I am static block from BaseClassStaticBlock Class");
	}
	
	{
		System.out.println("Hi I am instance block from BaseClassStaticBlock Class");
	}
	
	BaseClassStaticBlock(){
		System.out.println("Hi I am constructor of BaseClassStaticBlock");
	}
	
}

class DerivedClassStaticBlock extends BaseClassStaticBlock{
	
	static {
		System.out.println("Hi I am static block from DerivedClassStaticBlock Class");
	}
	
	{
		System.out.println("Hi I am instance block from DerivedClassStaticBlock Class");
	}
	
	DerivedClassStaticBlock(){
		super();
		System.out.println("Hi I am constructor of DerivedClassStaticBlockClass");
	}
}
public class MyStaticBlockDemoClassPart2 {

	public static void main(String[] args) {
//		static int var;
		
		BaseClassStaticBlock bOb=new BaseClassStaticBlock();
		
		System.out.println("==========================");
		
		DerivedClassStaticBlock dOb=new DerivedClassStaticBlock();
		
		System.out.println("=====================");
		
		BaseClassStaticBlock bOb1=new BaseClassStaticBlock();
		System.out.println("==================");

		DerivedClassStaticBlock dOb1=new DerivedClassStaticBlock();
	}

}
