package com.sujata.demo;


class OurOuter{

    public void demoMethod(){
        int x=10;
        class Inner{
            int value;
            public void show(){
                System.out.println("Hi I am show method of Inner Class");
            }
        }
        System.out.println("Some Statement");

        Inner inner=new Inner();
        inner.show();
    }
}
public class MethodLocalInnerClass {
    public static void main(String args[]){
    OurOuter ourOuter=new OurOuter();
    ourOuter.demoMethod();
    }
}
