package com.sujata.entity;

import java.util.Comparator;

public class PriceSort implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if(book1.equals(book2))
            return 0;
        else if(book1.getPrice()>book2.getPrice())
            return 1;
        else if(book1.getPrice()<book2.getPrice())
            return -1;
        return 0;
    }
}
