package com.sujata.demo;

public class ThirdClassDemo extends SecondDemoClass{

    static{
        System.out.println("Hi I am static block from ThirdClassDemo(Derived)");
    }

    {
        System.out.println("Hi I am instance block from ThirdClassDemo(Derived)");
    }

    ThirdClassDemo(){
        System.out.println("Hi I am SecondDemoClassConstructor(Derived)");
    }
}
