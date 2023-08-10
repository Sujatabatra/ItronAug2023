package com.sujata.demo;

public class SecondDemoClass {

    static{
        System.out.println("Hi I am static block from SecondDemoClass(Base)");
    }

    {
        System.out.println("Hi I am instance block from SecondDemoClass(Base)");
    }

    SecondDemoClass(){
        System.out.println("Hi I am SecondDemoClassConstructor(Base)");
    }
}
