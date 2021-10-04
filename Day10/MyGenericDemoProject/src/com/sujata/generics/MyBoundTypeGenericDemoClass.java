package com.sujata.generics;

class AClass{
	void show() {
		System.out.println("Hi I am show from AClass");
	}
}

class BClass extends AClass{
	void show() {
		System.out.println("Hi I am show from BClass");
	}
}

class CClass extends BClass{
	void show() {
		System.out.println("Hi I am show from CClass");
	}
}

class DClass extends CClass{
	void show() {
		System.out.println("Hi I am show from DClass");
	}
}

class MyGeneric<T extends CClass>{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
public class MyBoundTypeGenericDemoClass {

	public static void main(String[] args) {
//		MyGeneric<CClass> ob1=new MyGeneric<DClass>();
		MyGeneric<CClass> ob1=new MyGeneric<CClass>();
		ob1.setValue(new DClass());

		
//		MyGeneric<AClass> ob=new MyGeneric<>();
		
		MyGeneric<DClass> ob2=new MyGeneric<>();
	}

}
