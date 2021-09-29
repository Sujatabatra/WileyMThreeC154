package com.sujata.demo;


public class AgeInput {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws AgeCheckedException {
		if(age<18)
			throw new AgeCheckedException("Age Can't be less then 18");
		this.age = age;
	}
	
	public void inputAge(int age) {
		if(age<18)
			throw new AgeUncheckedException("Age must be greater then 18");
		this.age=age;
	}
}
