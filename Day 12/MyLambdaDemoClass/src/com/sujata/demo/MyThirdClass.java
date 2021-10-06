package com.sujata.demo;

@FunctionalInterface
interface Addition {
	public int sum(int number1, int number2);
}

public class MyThirdClass {

	public static void main(String[] args) {

//		Addition ob=new Addition() {
//			@Override
//			public int sum(int number1, int number2) {
//				return number1+number2;
//			}
//		};

//		Addition ob = (int number1, int number2) -> {
//			return number1 + number2;
//		};

//		Addition ob = (number1, number2) -> {
//			return number1 + number2;
//		};

		Addition ob = (number1, number2) -> number1 + number2;
		
		System.out.println("Sum :" + ob.sum(60, 90));
	}

}
