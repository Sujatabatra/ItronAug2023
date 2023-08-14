package com.sujata.demo;

import java.util.Scanner;
import java.util.function.Function;

public class FirstClassDemo {

    public static void main(String args[]){

//        Function<String,Integer> convert=(value)->Integer.parseInt(value);

        Function<String,Integer> convert=Integer::parseInt;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Numeric String :");
        String num1=scanner.next();
        System.out.println("Enter Second Numeric String :");
        String num2=scanner.next();

        Integer result=convert.apply(num1)+convert.apply(num2);

        System.out.println("Sum : "+result);
    }
}
