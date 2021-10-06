package com.sujata.demo;

import java.util.Optional;
import java.util.Scanner;

import com.sujata.bean.Person;

public class PersonDetailsMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		PersonDetails personDetails=new PersonDetails();
		
		System.out.println("Enter Person ID ");
		int id=scanner.nextInt();
		
//		Person person=personDetails.searchPersonById(id);

//		System.out.println("Person Name is "+person.getPersonName()+" whoes id is "+id);
		
		Optional<Person> personObj=personDetails.searchPersonByIdOneMore(id);
		personObj.ifPresent(System.out::println);
		
	
	}

}
