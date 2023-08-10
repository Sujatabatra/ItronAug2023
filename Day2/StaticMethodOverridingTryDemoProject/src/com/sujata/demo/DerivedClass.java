package com.sujata.demo;

public class DerivedClass extends BaseClass{
    @Override
    public void methodOne(){
        System.out.println("Hi I am methodOne from DerivedClass");
    }


//    @Override
    static public void methodTwo(){
        System.out.println("Hi I am methodTwo from DerivedClass");
    }
}
