package com.sujata.setdemos;

import com.sujata.entity.MyPerson;
import com.sujata.entity.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String args[]){
        /*
        HashSet is unordered unique collection of objects,
        and collection is auto growable and auto shrinkable
         */
        Set<MyPerson> collection=new TreeSet<>();

        System.out.println("Size of Collection : "+collection.size());
        collection.add(new MyPerson(1,"AAAA",78));
        collection.add(new MyPerson(2,"BBBB",18));
        collection.add(new MyPerson(3,"CCCC",45));

        System.out.println("Size of Collection : "+collection.size());

        collection.add(new MyPerson(1,"AAAA",78));
        collection.add(new MyPerson(4,"DDDD",67));
        System.out.println("Size of Collection : "+collection.size());
        System.out.println(collection);


        System.out.println("Traversal using for each");
        for(MyPerson element:collection){
            System.out.println(element);
        }

        System.out.println("Traversal using Iterator");

        Iterator<MyPerson> iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
