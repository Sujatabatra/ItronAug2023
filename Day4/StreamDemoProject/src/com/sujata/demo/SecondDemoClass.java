package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class SecondDemoClass {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(11,22,33,44,55);

        list.stream()
                .forEach(element->System.out.println(element));

        long totalNoOfElement=list.stream()
                .count();

        System.out.println("Total Number of Elements : "+totalNoOfElement);

        System.out.println("Total No of Even Elements : "+list.stream()
                .filter(element->element%2==0)
                .count());
//
//        list.stream()
//                .filter(element->element%2==0)   //intermediate (multiple)
//                .forEach(ele->System.out.println(ele));  //terminate (one)

        list.stream()
                .filter(element->element%2==0)   //intermediate (multiple)
                .forEach(System.out::println);  //terminate (one)

        list.stream()
                .filter(element->element%2!=0)  //intermediate
                .map(ele->ele*10)               //intermediate
                .forEach(number->System.out.println(number)); //terminal


    }
}
