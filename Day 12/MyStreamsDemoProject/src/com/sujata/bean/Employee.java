package com.sujata.bean;

public class Employee {

	private int empId;
	private String empName;
	private String desig;
	private String deptt;
	private int salary;
	public Employee() {
		
	}
	public Employee(int empId, String empName, String desig, String deptt, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desig = desig;
		this.deptt = deptt;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getDeptt() {
		return deptt;
	}
	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
