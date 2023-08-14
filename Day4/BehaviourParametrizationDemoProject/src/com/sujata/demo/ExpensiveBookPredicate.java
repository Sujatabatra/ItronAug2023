package com.sujata.demo;

import com.sujata.entity.Book;

public class ExpensiveBookPredicate implements BookPredicate{
    @Override
    public boolean bookTest(Book book) {
        return book.getPrice()>2000;
    }
}
