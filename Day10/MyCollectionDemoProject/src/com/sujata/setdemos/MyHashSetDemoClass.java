package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * Unique Collection of elements
		 */
		Set<Integer> uniqueCollection;
		//Unordered Unique Collection of Elements
		uniqueCollection=new HashSet<Integer>();
		
		System.out.println("Size of Unique Collection : "+uniqueCollection.size());
		
		uniqueCollection.add(10);
		uniqueCollection.add(20);
		uniqueCollection.add(30);
		uniqueCollection.add(10);
		
		System.out.println("Size of Unique Collection : "+uniqueCollection.size());
		System.out.println(uniqueCollection);
		
		uniqueCollection.add(null);
		uniqueCollection.add(null);
		
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
