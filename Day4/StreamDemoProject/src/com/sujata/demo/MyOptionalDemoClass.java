package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

class BookSearch{
    private static List<Book> bookList=new ArrayList<>();
    static{
        bookList.add(new Book(1,"Book 1","Author A",1700,650));
        bookList.add(new Book(2,"Book 2","Author B",1000,1970));
        bookList.add(new Book(3,"Book 3","Author A",1250,650));
        bookList.add(new Book(4,"Book 4","Author X",700,850));
        bookList.add(new Book(5,"Book 5","Author A",8000,6180));
        bookList.add(new Book(6,"Book 6","Author M",1600,1650));

    }

//    public Book searchBookById(int id) {
//    try {
//        return bookList.stream().filter(book -> book.getBookId() == id)
//                .collect(Collectors.toList()).get(0);
//    }
//    catch(IndexOutOfBoundsException ex){
//        return null;
//    }
//    }

    public Optional<Book> searchBookById(int id) {
        try {
            return Optional.of( bookList.stream().filter(book -> book.getBookId() == id)
                    .collect(Collectors.toList()).get(0));
        }
        catch(IndexOutOfBoundsException ex){
            return Optional.ofNullable(null);
        }
    }
}
public class MyOptionalDemoClass {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Book ID : ");
        int id=scanner.nextInt();

        BookSearch bookSearch=new BookSearch();
        Optional<Book> optionalBook=bookSearch.searchBookById(id);
        System.out.println(optionalBook.orElse(new Book(0,"No Book","",0,0.0)).getBookName());

    }
}
