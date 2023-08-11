package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSetDemo {
    public static void main(String args[]){
        /*
        HashSet is unordered unique collection of objects,
        and collection is auto growable and auto shrinkable
         */
        Set<Integer> collection=new HashSet<>();

        System.out.println("Size of Collection : "+collection.size());
        collection.add(10);
        collection.add(20);
        collection.add(30);

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
