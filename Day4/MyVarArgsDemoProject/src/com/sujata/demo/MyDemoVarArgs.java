package com.sujata.demo;
/*
 * 1. var-arg replaces : zero or more arguments
 * 2. We can't have one method with mutiple var-arg types arguments
 * 3. We can have a method which accepts one var-arg type arguments and rest non-var-arg types any no of argumnets
 * 3.1 var-arg argument must be the last argument in the argument list
 * 4. we can overload/override the method having var-arg  
 */
public class MyDemoVarArgs {

	public int sum(int...args) {
		System.out.println("var arg sum");
		int s=0;
		for(int element:args) {
			s=s+element;
		}
		return s;
	}
	
	public int sum(int x,int y,int z) {
		System.out.println("3 parameter sum");
		return x+y+z;
	}
	
//	public int sum(int x,int y,int...z) {
//		System.out.println("3 parameter sum with one as var args");
//		return x+y;
//	}
	
	/*Invalid as per point 2*/
//	public void dummy(int...args1,String...args2) {
//		
//	}
	
	public void dummy(int x,String y, float z,String...args) {
		
	}
	
	public void dummy(int x,String...args) {
		
	}
	
	/*Invalid as per point 3.1 */
//	public void demo(int x,char...args,bolean b) {
//		
//	}
}
