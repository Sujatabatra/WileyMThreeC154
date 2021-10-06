package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sujata.bean.Person;

public class PersonDetails {

	private static ArrayList<Person> persons = new ArrayList<Person>();

	static {
		persons.add(new Person(111, "Akash"));
		persons.add(new Person(222, "Bhavya"));
		persons.add(new Person(333, "Charu"));
		persons.add(new Person(444, "Daksh"));
		persons.add(new Person(555, "Esha"));
		persons.add(new Person(666, "Faraz"));
	}

	public static ArrayList<Person> getPersons() {
		return persons;
	}

	public Person searchPersonById(int id) {
		List<Person> per = persons.stream().filter(person -> person.getPersonId() == id).collect(Collectors.toList());
		Person person = null;
		if (per.size() > 0)
			person = per.get(0);
		return person;
	}
	
	public Optional<Person> searchPersonByIdOneMore(int id) {
		List<Person> per = persons.stream().filter(person -> person.getPersonId() == id).collect(Collectors.toList());
		Person person = null;
		if (per.size() > 0)
			person = per.get(0);
		Optional<Person> optionalPerson=Optional.ofNullable(person);
		return optionalPerson;
	}
}
