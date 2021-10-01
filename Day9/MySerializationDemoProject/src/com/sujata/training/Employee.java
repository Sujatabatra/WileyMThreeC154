package com.sujata.training;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Person implements Serializable{

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
	
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		oos.writeObject(getPersonId());
		oos.writeObject(getPersonName());
		
		
		
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		ois.defaultReadObject();
		setPersonId((int)ois.readObject());
		setPersonName((String)ois.readObject());
		
		
	}
}
