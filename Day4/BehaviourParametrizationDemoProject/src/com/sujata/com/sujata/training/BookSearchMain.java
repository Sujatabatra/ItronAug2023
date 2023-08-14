package com.sujata.com.sujata.training;

import com.sujata.demo.AuthorABookPredicate;
import com.sujata.demo.BookPredicate;
import com.sujata.demo.BookSearch;
import com.sujata.demo.ExpensiveBookPredicate;
import com.sujata.entity.Book;

import java.util.List;
import java.util.Optional;

public class BookSearchMain {

    public static void main(String args[]){
        BookSearch bookSearch=new BookSearch();

//        System.out.println(bookSearch.searchBookByAuthorA());
//
//        System.out.println(bookSearch.searchExpensiveBooks());

            System.out.println(bookSearch.genericSearch(new AuthorABookPredicate()));

            System.out.println(bookSearch.genericSearch(new ExpensiveBookPredicate()));

//        List<Book> thickBookList=bookSearch.genericSearch(new BookPredicate() {
//            @Override
//            public boolean bookTest(Book book) {
//                return book.getNoOfPages()>3500;
//            }
//        });

        List<Book> thickBookList=bookSearch.genericSearch(book-> book.getNoOfPages()>3500);



    }
}
