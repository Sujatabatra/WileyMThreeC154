package com.sujata.person;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private int personId;
	private String personName;
	transient private int personAge;
	transient private Address address;

	public Person() {

	}

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + ", address="
				+ address + "]";
	}
	
	private void writeObject(ObjectOutputStream ous)throws IOException, ClassNotFoundException{
		ous.defaultWriteObject();
		ous.writeObject(address.gethNo());
		ous.writeObject(address.getStreetName());
		ous.writeObject(address.getCity());
		ous.writeObject(address.getState());
		ous.writeObject(address.getPinCode());
	}
	
	private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
		ois.defaultReadObject();
		this.address=new Address((int)ois.readObject(),(String)ois.readObject(),(String)ois.readObject(),(String)ois.readObject(),(String)ois.readObject());
	}

	
}
