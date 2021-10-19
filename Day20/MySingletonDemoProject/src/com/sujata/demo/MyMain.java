package com.sujata.demo;

public class MyMain {

	public static void main(String[] args) {
		MySingletonClass ob1,ob2;
		
		ob1=MySingletonClass.getInstance();
		System.out.println("ob1 : "+ob1);
		
		ob2=MySingletonClass.getInstance();
		System.out.println("ob2 : "+ob2);

	}

}
