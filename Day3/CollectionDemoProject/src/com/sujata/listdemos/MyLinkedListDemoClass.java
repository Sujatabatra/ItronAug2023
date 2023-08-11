package com.sujata.listdemos;

import java.util.*;

public class MyLinkedListDemoClass {
    public static void main(String args[]){

        /*
        LinkedList is duplicate ordered indexed collection of elements,
        which is autogrowble and autoshrinkable
         */

        List<Integer> collection=new LinkedList<>();

        System.out.println("Size of Collection : "+collection.size());
        collection.add(10); //0 index
        collection.add(20);  //1 index
        collection.add(30);
        collection.add(10);
        collection.add(50);
        collection.add(90);
        System.out.println("Size of Collection : "+collection.size());
        System.out.println(collection);

        collection.remove(2);
        System.out.println("Size of Collection : "+collection.size());
        System.out.println(collection);

        System.out.println("Traversal using traditional for loop");
        for(int index=0;index<collection.size();index++){
            System.out.println(collection.get(index));
        }

        System.out.println("Traversal using for each loop");
        for(Integer element:collection){
            System.out.println(element);
        }

        System.out.println("Traversal using Iterator");
        Iterator<Integer> iterator=collection.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("Reverse Traversal using ListIterator");
        ListIterator<Integer> listIterator=collection.listIterator();
        while(listIterator.hasNext())
            listIterator.next();
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());

    }
}
