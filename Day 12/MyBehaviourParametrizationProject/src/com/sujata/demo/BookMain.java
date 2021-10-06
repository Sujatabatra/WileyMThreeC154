package com.sujata.demo;

import java.util.ArrayList;

import com.sujata.bean.Book;

public class BookMain {

	public static void main(String[] args) {

		ArrayList<Book> books = BooksLibrary.getBooks();
		System.out.println(books);

		BooksLibrary bookLibrary = new BooksLibrary();

		System.out.println(bookLibrary.getBooksWrittenByAuthorX());

		System.out.println("List of Thick Books");
		System.out.println(bookLibrary.searchBook(new ThickBookPredicate()));

		System.out.println("List of Books written by Author X");
		System.out.println(bookLibrary.searchBook(new ThickBookPredicate()));

		System.out.println("Expensive books:" + bookLibrary.searchBook(new BookPredicate() {

			@Override
			public boolean test(Book book) {

				return book.getPrice() > 1500;
			}
		}));

		System.out.println("Expensive books:" + bookLibrary.searchBook1(book-> book.getPrice()>1500));
			
	
	}

}
