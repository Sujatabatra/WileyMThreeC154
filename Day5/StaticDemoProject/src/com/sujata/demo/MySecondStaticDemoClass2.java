package com.sujata.demo;

class SecondStaticClass{
	private int x;
	private static int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public static void setY(int y) {
		SecondStaticClass.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public static int getY() {
		return y;
	}
	public void input(int n1,int n2) {
		this.x=n1;
		y=n2;
	}
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
}
public class MySecondStaticDemoClass2 {

	public static void main(String[] args) {
	
		SecondStaticClass.setY(10);
		System.out.println(" y : "+SecondStaticClass.getY());
		
//		FirstStaticClass.y=10;
//		System.out.println("y : "+FirstStaticClass.y);
//		
//		FirstStaticClass ob1=new FirstStaticClass();
		
//		ob1.x=10;
//		ob1.y=20;
//		
//		FirstStaticClass ob2=new FirstStaticClass();
//		ob2.x=5;
//		ob2.y=15;
//		
//		ob1.show();
	}

}
