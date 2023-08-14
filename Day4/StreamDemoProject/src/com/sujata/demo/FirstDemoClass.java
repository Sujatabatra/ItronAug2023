package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemoClass {
    public static void main(String args[]){
        List<Integer> collection= Arrays.asList(10,20,30,40,50);

        Stream<Integer> elementStream= collection.stream();

//        elementStream.forEach(num->System.out.println(num));

        long totalNoOfValues=elementStream.count(); //java.lang.IllegalStateException: stream has already been operated upon or closed
        System.out.println(totalNoOfValues);
    }
}
