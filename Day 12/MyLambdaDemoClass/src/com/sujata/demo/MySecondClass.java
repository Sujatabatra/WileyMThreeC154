package com.sujata.demo;

import java.util.function.Consumer;

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
		
		Consumer<String> greet1=name->System.out.println("Good Morning "+name);
		greet1.accept("Sujata");
	}

}
