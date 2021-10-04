package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;



public class MyVectorDemoClass {

	public static void main(String[] args) {
		//Allow duplicates
		Vector<Integer> duplicateCollection;

		//Ordered Duplication Collection of elements
		duplicateCollection=new Vector<Integer>();
		
		System.out.println(duplicateCollection.size());
		
		duplicateCollection.add(20);
		duplicateCollection.add(50);
		duplicateCollection.add(90);
		duplicateCollection.add(70);
		duplicateCollection.add(20);
		
		System.out.println("size : "+duplicateCollection.size());
		System.out.println(duplicateCollection);
		
		duplicateCollection.add(null);
		duplicateCollection.add(null);
		
		System.out.println("size : "+duplicateCollection.size());
		System.out.println(duplicateCollection);
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<duplicateCollection.size();index++) {
			System.out.println(duplicateCollection.get(index));
		}
		
		System.out.println("Traversal using for each ");
		for(Integer element:duplicateCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using iterator");
		Iterator<Integer> iterator=duplicateCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Traversal using List Iterator");
		ListIterator<Integer> listIterator=duplicateCollection.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("Traversal using Enumeration");
		Enumeration<Integer> enumeration=duplicateCollection.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
