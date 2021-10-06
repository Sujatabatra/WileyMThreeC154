package com.sujata.demo;

import java.util.function.Consumer;
import java.util.function.Function;

class ShowClass{
	
	public static void showMessage(String msg) {
		System.out.println(msg);
	}
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		
//		Function<String, Integer> var=new Function<String, Integer>() {
//			@Override
//			public Integer apply(String t) {
//				return Integer.parseInt(t);
//			}
//			
//		};
		
//		Function<String, Integer> var=(str)->Integer.parseInt(str);

		Function<String, Integer> var=Integer::parseInt;
		
		Integer i=var.apply("120");
		System.out.println("i : "+i);
		
//		Consumer<String> consumer=new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				ShowClass.showMessage(t);
//			}
//		
//		};
		/*
		 * Consumer<String> consumer=t-> ShowClass.showMessage(t.toUpperCase());
		 * as argument got modified so method refrence not possible
		 */
//		Consumer<String> consumer=t-> ShowClass.showMessage(t);
		
		Consumer<String> consumer=ShowClass::showMessage;
		
		consumer.accept("Hello Everyone how are you");
	}

}
