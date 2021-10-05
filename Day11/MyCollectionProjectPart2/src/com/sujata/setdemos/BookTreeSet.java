package com.sujata.setdemos;

import java.util.TreeSet;

import com.sujata.bean.Book;

public class BookTreeSet {

	public static void main(String[] args) {
		TreeSet<Book> books=new TreeSet<>();
		
		books.add(new Book(111,"ABC","Mr. X",800,550));
		books.add(new Book(222,"MNO","Mr. Y",890,550));
		books.add(new Book(333,"DDD","Mr. Z",900,550));
		books.add(new Book(444,"JJJ","Mr. X",700,550));
		books.add(new Book(111,"XYZ","Mr. XT",1800,550));
		
		for(Book book:books) {
			System.out.println(book);
		}
	}

}
