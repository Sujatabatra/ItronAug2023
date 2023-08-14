package com.sujata.demo;

interface MyGreet{
    public void wish(String name);
}

public class SecondDemoClass {
    public static void main(String args[]){

//        MyGreet myGreet=new MyGreet() {
//            @Override
//            public void wish(String name) {
//            System.out.println(name+" welcome to the world of Lambda's");
//            }
//        };

//        MyGreet myGreet=(String name)-> {
//                System.out.println(name+" welcome to the world of Lambda's");
//            };

//        MyGreet myGreet=(String name)-> System.out.println(name+" welcome to the world of Lambda's");

//        MyGreet myGreet=(name)-> System.out.println(name+" welcome to the world of Lambda's");

        MyGreet myGreet=name-> System.out.println(name+" welcome to the world of Lambda's");

        myGreet.wish("Amrit");


    }

}
