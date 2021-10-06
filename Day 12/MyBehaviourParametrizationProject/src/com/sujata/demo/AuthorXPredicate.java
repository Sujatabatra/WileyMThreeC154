package com.sujata.demo;

import com.sujata.bean.Book;

public class AuthorXPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		return book.getAuthorName().equals("Mr. X");
	}

}
