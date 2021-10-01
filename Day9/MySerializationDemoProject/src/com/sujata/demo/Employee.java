package com.sujata.demo;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Person{

	private String department;
	
	public Employee() {
		
	}

	public Employee(int personId, String personName, String department) {
		super(personId, personName);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString()+" Employee [department=" + department + "]";
	}
	
	
	private void writeObject(ObjectOutputStream oos) throws NotSerializableException{
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream ois) throws NotSerializableException{
		throw new NotSerializableException();
	}
}
