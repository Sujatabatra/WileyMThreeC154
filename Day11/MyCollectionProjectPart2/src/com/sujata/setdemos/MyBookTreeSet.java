package com.sujata.setdemos;

import java.util.TreeSet;

import com.sujata.bean.Book;
import com.sujata.bean.MyBook;
import com.sujata.bean.PriceSorting;

public class MyBookTreeSet {

	public static void main(String[] args) {
		TreeSet<MyBook> books=new TreeSet<>(new PriceSorting());
		
		books.add(new MyBook(111,"ABC","Mr. X",800,550));
		books.add(new MyBook(222,"MNO","Mr. Y",890,1550));
		books.add(new MyBook(333,"DDD","Mr. Z",900,600));
		books.add(new MyBook(444,"JJJ","Mr. X",700,790));
		books.add(new MyBook(111,"XYZ","Mr. XT",1800,150));
		
		for(MyBook book:books) {
			System.out.println(book);
		}
	}

}
