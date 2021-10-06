package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MySecondDemoClass {

	public static void main(String[] args) {
		
//		Consumer<String> consumer=new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		};
		
//		Consumer<String> consumer= t-> System.out.println(t);
		
		Consumer<String> consumer= System.out::println;
		
		consumer.accept("Hello");
		
//		BiFunction<String, String,Integer> biFunction=(str1,str2)->str1.compareTo(str2);
		
		BiFunction<String, String,Integer> biFunction=String::compareTo;
		
		System.out.println(biFunction.apply("Batra", "Batra"));
		

	}

}
