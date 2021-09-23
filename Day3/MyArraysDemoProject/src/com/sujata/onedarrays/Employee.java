package com.sujata.onedarrays;

//POJO : Plain Old Java Object / JavaBeans
public class Employee {

	private int eId;
	private String eName;

	public Employee() {

	}

	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee with employee Id=" + eId + " has  Name=" + eName  ;
	}

	
}
