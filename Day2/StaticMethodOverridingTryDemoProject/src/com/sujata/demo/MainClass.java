package com.sujata.demo;

public class MainClass {
    public static void main(String args[]){
        BaseClass baseClass;

//        baseClass=new BaseClass();
        baseClass=new DerivedClass();
        baseClass.methodOne();
        baseClass.methodTwo();

        BaseClass.methodTwo();
        DerivedClass.methodTwo();
    }
}
