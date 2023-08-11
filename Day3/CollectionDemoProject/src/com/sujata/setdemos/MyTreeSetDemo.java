package com.sujata.setdemos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemo {
    public static void main(String args[]){
        /*
        TreeSet is sorted unique collection of objects,
        and collection is auto growable and auto shrinkable
         */
        Set<Integer> collection=new TreeSet<>();

        System.out.println("Size of Collection : "+collection.size());
        collection.add(100);
        collection.add(20);
        collection.add(3);

        System.out.println("Size of Collection : "+collection.size());

        collection.add(40);
        collection.add(10);
        System.out.println("Size of Collection : "+collection.size());
        System.out.println(collection);

        collection.remove(40);
        System.out.println("Size of Collection : "+collection.size());
        System.out.println(collection);

        System.out.println("Traversal using for each");
        for(Integer element:collection){
            System.out.println(element);
        }

        System.out.println("Traversal using Iterator");

        Iterator<Integer> iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
