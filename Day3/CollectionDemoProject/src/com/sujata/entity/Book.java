package com.sujata.entity;

import java.util.Objects;

public class Book {
    private int bookId;
    private String bookName;
    private int price;
    private int noOfPages;

    public Book(){

    }

    public Book(int bookId, String bookName, int price, int noOfPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.noOfPages = noOfPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && price == book.price && noOfPages == book.noOfPages && Objects.equals(bookName, book.bookName);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(bookId, bookName, price, noOfPages);
//    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", noOfPages=" + noOfPages +
                '}';
    }
}
