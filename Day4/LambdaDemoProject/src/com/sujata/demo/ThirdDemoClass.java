package com.sujata.demo;

interface Print{
    String show();
}

public class ThirdDemoClass {
    public static void main(String args[]){

//        Print print=new Print() {
//            @Override
//            public String show() {
//                return "Hello Everyone";
//            }
//        };

//        Print print=()-> {
//                return "Hello Everyone";
//            };

        Print print=()-> "Hello Everyone";

        System.out.println(print.show());
    }
}
