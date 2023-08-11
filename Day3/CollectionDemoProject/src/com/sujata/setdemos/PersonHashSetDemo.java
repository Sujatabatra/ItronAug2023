package com.sujata.setdemos;

import com.sujata.entity.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonHashSetDemo {
    public static void main(String args[]){
        /*
        HashSet is unordered unique collection of objects,
        and collection is auto growable and auto shrinkable
         */
        Set<Person> collection=new HashSet<>();

        System.out.println("Size of Collection : "+collection.size());
        collection.add(new Person(1,"AAAA",78));
        collection.add(new Person(2,"BBBB",18));
        collection.add(new Person(3,"CCCC",45));

        System.out.println("Size of Collection : "+collection.size());

        collection.add(new Person(1,"AAAA",78));
        collection.add(new Person(4,"DDDD",67));
        System.out.println("Size of Collection : "+collection.size());
        System.out.println(collection);


        System.out.println("Traversal using for each");
        for(Person element:collection){
            System.out.println(element);
        }

        System.out.println("Traversal using Iterator");

        Iterator<Person> iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
