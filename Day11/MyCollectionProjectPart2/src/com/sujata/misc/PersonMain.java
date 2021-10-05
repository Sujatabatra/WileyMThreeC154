package com.sujata.misc;

public class PersonMain {
	
	public static void main(String args[]) {
		int x=10;
		int y=10;
		if(x==y) {
			System.out.println("Both x and y are same");
		}
		else {
			System.out.println("x and y are not same");
		}
		
		Person p1=new Person(101, "AAAA");
		Person p2=new Person(101,"AAAA");
		
		//whether two refrences are pointing at same address in heap or not
		if(p1==p2) {
			System.out.println("Both p1 and p2 are same");
		}
		else {
			System.out.println("p1 and p2 are not same");
		}
		
		//whether two objects are equal depdenign upon content , then use equals method
		if(p1.equals(p2))
			System.out.println("Both p1 and p2 are same");
		else
			System.out.println("p1 and p2 are not same ");
		
		System.out.println(" hashcode of p1 : "+p1);
		System.out.println("hashcode of p2 : "+p2);
	}

}
