package com.sujata.setdemos;

import java.util.HashSet;

import com.sujata.misc.Person;

public class PersonHashSet {

	public static void main(String[] args) {
		HashSet<Person> persons=new HashSet<Person>();
		
		persons.add(new Person(101, "AAAA"));
		persons.add(new Person(102, "BBBB"));
		persons.add(new Person(103, "CCCC"));
		persons.add(new Person(101, "AAAA"));
		persons.add(new Person(104, "DDDD"));
		
		for(Person person:persons) {
			System.out.println(person);
		}

	}

}
