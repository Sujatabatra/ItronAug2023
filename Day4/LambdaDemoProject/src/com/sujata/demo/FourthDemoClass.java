package com.sujata.demo;

interface Calculate{
    int operate(int number1,int number2);
}
public class FourthDemoClass {
    public static void main(String args[]){
//    Calculate sum=new Calculate() {
//        @Override
//        public int operate(int number1, int number2) {
//            return number1+number2;
//        }
//    };

        Calculate sum=(number1,number2)-> number1+number2;


    System.out.println(sum.operate(10,20));


    }
}
