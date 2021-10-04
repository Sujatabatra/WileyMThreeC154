package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Unique Collection of elements
		 */
		Set<Integer> uniqueCollection;
		//Sorted Unique Collection of Elements
		uniqueCollection=new TreeSet<Integer>();
		
		System.out.println("Size of Unique Collection : "+uniqueCollection.size());
		
		uniqueCollection.add(10);
		uniqueCollection.add(120);
		uniqueCollection.add(30);
		uniqueCollection.add(10);
		
		System.out.println("Size of Unique Collection : "+uniqueCollection.size());
		System.out.println(uniqueCollection);
		
		
		
		System.out.println("Size of Unique Collection : "+uniqueCollection.size());
		System.out.println(uniqueCollection);

		uniqueCollection.remove(10);
		System.out.println("Size of Unique Collection : "+uniqueCollection.size());
		System.out.println(uniqueCollection);
		
		System.out.println("Traversal using for each loop");
		for(Integer element:uniqueCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		
		//Factory design pattern , iterator() is factory method
		Iterator<Integer> iterator=uniqueCollection.iterator();
//		System.out.println("My Iterator class"+iterator.getClass());

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
