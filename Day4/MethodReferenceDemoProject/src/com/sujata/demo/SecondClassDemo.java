package com.sujata.demo;

import java.util.function.Consumer;

public class SecondClassDemo {
    public static void main(String args[]){

//        Consumer<String> print=(name)->System.out.println(name);

        Consumer<String> print=System.out::println;
        print.accept("Hello Evevryone!");
    }
}
