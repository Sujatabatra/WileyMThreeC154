package com.sujata.generics;


class MySecondGeneric<T1,T2>{
	T1 valueOne;
	T2 valueTwo;
	public T1 getValueOne() {
		return valueOne;
	}
	public void setValueOne(T1 valueOne) {
		this.valueOne = valueOne;
	}
	public T2 getValueTwo() {
		return valueTwo;
	}
	public void setValueTwo(T2 valueTwo) {
		this.valueTwo = valueTwo;
	}
	
	
	
}
public class MySecondGenericDemo {

	public static void main(String[] args) {
		MySecondGeneric<String,Integer> ob1=new MySecondGeneric<>();
		

	}

}
