package com.sujata.demo;

import com.sujata.bean.Book;

public class ThickBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		return book.getNoOfPages()>1000;
	}

}
