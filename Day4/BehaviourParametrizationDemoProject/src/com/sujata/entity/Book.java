package com.sujata.entity;

import com.sujata.demo.BookSearch;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private int noOfPages;
    private double price;


}
