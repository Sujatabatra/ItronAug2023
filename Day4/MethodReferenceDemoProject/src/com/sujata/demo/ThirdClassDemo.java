package com.sujata.demo;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ThirdClassDemo {
    public static void main(String args[]){
//        Function<String,Integer> calculateLength=(name)->name.length();

        Function<String,Integer> calculateLength=String::length;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name=scanner.next();

        System.out.println("Length of "+name+" : "+calculateLength.apply(name));

//        BiFunction<String,String,String> mergeNames=(fname,lname)->fname.concat(lname);

        BiFunction<String,String,String> mergeNames=String::concat;

        System.out.println("Enter First Name : ");
        String firstName=scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName=scanner.next();

        String fullName=mergeNames.apply(firstName,lastName);
        System.out.println("Full Name : "+fullName);
    }
}
