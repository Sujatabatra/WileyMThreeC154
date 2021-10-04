package com.sujata.generics;

class InputInteger{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class InputFloat{
	private float value;

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	
}

class InputString{
	private String values;

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}
	
}

class InputValue<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
public class MyFirstGenericsDemo {

	public static void main(String[] args) {
		InputValue<String> ob=new InputValue<>();
		
		
		InputValue<Integer> ob1=new InputValue<>();

		InputValue<Person> ob2=new InputValue<>();
		ob.setValue("Sujata");
		ob1.setValue(10);
		ob2.setValue(new Person(111,"AAA"));
		
		System.out.println("ob : "+ob.getValue());
		System.out.println("ob1 : "+ob1.getValue());
		System.out.println("ob2 : "+ob2.getValue());
	}

}
