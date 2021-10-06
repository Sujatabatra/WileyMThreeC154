package com.sujata.demo;

class Person{
	private int pId;
	private String pName;
	
	public Person() {
		
	}

	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
}
interface PersonFactory{
	Person getPerson(int id,String name);
}
public class MyThirdDemoClass {

	public static void main(String args[]) {
//		PersonFactory personFactory=new PersonFactory() {
//			@Override
//			public Person getPerson(int id, String name) {
//				return new Person(id,name);
//			}
//		};
		
//		PersonFactory personFactory=(id, name)-> new Person(id,name);
		
		PersonFactory personFactory=Person::new;

		
		Person person=personFactory.getPerson(101, "AAAA");
		System.out.println(person);
	}
}
