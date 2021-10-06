package com.sujata.demo;

@FunctionalInterface
interface Greet{
	public void wish(String name);
}

public class MySecondClass {

	public static void main(String[] args) {
//		Greet greet=new Greet() {
//			@Override
//			public void wish(String name) {
//				System.out.println("Welcome "+name);
//			}
//		};
		
//		Greet greet=(String name)-> {
//				System.out.println("Welcome "+name);
//			};
//		
//		Greet greet=(name)-> {
//			System.out.println("Welcome "+name);
//		};
		

//		Greet greet=name-> {
//			System.out.println("Welcome "+name);
//		};
		

		Greet greet=name->System.out.println("Welcome "+name);
		
		greet.wish("Sujata");
	}

}
