package com.sujata.com.sujata.training;

import com.sujata.demo.AuthorABookPredicate;
import com.sujata.demo.BookSearch;
import com.sujata.demo.ExpensiveBookPredicate;

import java.util.Optional;

public class BookSearchMain {

    public static void main(String args[]){
        BookSearch bookSearch=new BookSearch();

//        System.out.println(bookSearch.searchBookByAuthorA());
//
//        System.out.println(bookSearch.searchExpensiveBooks());

            System.out.println(bookSearch.genericSearch(new AuthorABookPredicate()));

        System.out.println(bookSearch.genericSearch(new ExpensiveBookPredicate()));
    }
}
