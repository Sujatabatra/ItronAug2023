package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.*;

public class ThirdDemoClass {
    public static void main(String args[]){
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book(1,"Book 1","Author A",1700,650));
        bookList.add(new Book(2,"Book 2","Author B",1000,1970));
        bookList.add(new Book(3,"Book 3","Author A",1250,650));
        bookList.add(new Book(4,"Book 4","Author X",700,850));
        bookList.add(new Book(5,"Book 5","Author A",8000,6180));
        bookList.add(new Book(6,"Book 6","Author M",1600,1650));

        List<Book> expensiveBookList= bookList.stream()
                .filter(book->book.getPrice()>1700)
                .collect(toList());

        System.out.println(expensiveBookList);
    }
}
