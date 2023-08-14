package com.sujata.demo;

//Functional Interface
@FunctionalInterface
interface Greet{
    public void wish();
}

public class FirstDemoClass {
    public static void main(String args[]){
        Greet greetVariable;
//        greetVariable=new Greet() {
//            @Override
//            public void wish() {
//                System.out.println("Good Morning!");
//            }
//        };

        /*
        Lambda
         */

//        greetVariable=()-> {
//                System.out.println("Good Morning!");
//            };

        greetVariable=()->System.out.println("Good Morning!");

        greetVariable.wish();

    }
}
