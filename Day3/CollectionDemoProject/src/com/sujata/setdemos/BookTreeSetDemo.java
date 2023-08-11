package com.sujata.setdemos;

import com.sujata.entity.Book;
import com.sujata.entity.MyPerson;
import com.sujata.entity.PriceSort;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookTreeSetDemo {
    public static void main(String args[]){
        /*
        HashSet is unordered unique collection of objects,
        and collection is auto growable and auto shrinkable
         */
        Set<Book> collection=new TreeSet<>(new PriceSort());

        System.out.println("Size of Collection : "+collection.size());
        collection.add(new Book(1,"Book1",750,190));
        collection.add(new Book(2,"Book2",50,150));
        collection.add(new Book(3,"Book3",800,5200));

        System.out.println("Size of Collection : "+collection.size());

        collection.add(new Book(1,"Book1",750,190));
        collection.add(new Book(4,"Book4",250,1900));
        System.out.println("Size of Collection : "+collection.size());
        System.out.println(collection);


        System.out.println("Traversal using for each");
        for(Book element:collection){
            System.out.println(element);
        }

        System.out.println("Traversal using Iterator");

        Iterator<Book> iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
