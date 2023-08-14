package com.sujata.demo;

import com.sujata.entity.Book;

public class AuthorABookPredicate implements BookPredicate{
    @Override
    public boolean bookTest(Book book) {
        return book.getAuthorName().equals("Author A");
    }
}
