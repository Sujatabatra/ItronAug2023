package com.sujata.demo;

import com.sujata.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookSearch {

    private static List<Book> bookList=new ArrayList<>();

    static{
        bookList.add(new Book(1,"Book 1","Author A",890,780));
        bookList.add(new Book(2,"Book 2","Author X",950,7000));
        bookList.add(new Book(3,"Book 3","Author A",1670,850));
        bookList.add(new Book(4,"Book 4","Author M",550,1780));
        bookList.add(new Book(5,"Book 5","Author A",1700,2500));
        bookList.add(new Book(6,"Book 6","Author Y",1450,3500));
    }

    public List<Book> searchBookByAuthorA(){
        List<Book> books=new ArrayList<>();
        for(Book book:bookList){
            if(book.getAuthorName().equals("Author A"))
                books.add(book);
        }
        return books;
    }

    public List<Book> searchExpensiveBooks(){
        List<Book> books=new ArrayList<>();
        for(Book book:bookList){
            if(book.getPrice()>2000)
                books.add(book);
        }
        return books;
    }
/*
Behaviour Parametrization
 */
    public List<Book> genericSearch(BookPredicate bookPredicate){
        List<Book> books=new ArrayList<>();
        for(Book book:bookList){
            if(bookPredicate.bookTest(book))
                books.add(book);
        }
        return books;
    }
}
