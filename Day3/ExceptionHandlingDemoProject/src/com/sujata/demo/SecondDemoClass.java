package com.sujata.demo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondDemoClass {

    public static void divide(int num1,int num2){
        try{
            int divide=num1/num2;
            System.out.println("Result : "+divide);
            System.out.println("Good Bye from Try");
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void main(String args[]){
            Scanner scanner=new Scanner(System.in);
            try {
                System.out.println("Enter First Number : ");
                int number1 = scanner.nextInt();
                System.out.println("Enter Second Number : ");
                int number2 = scanner.nextInt();
                divide(number1, number2);
            }
            catch (ArithmeticException exception){
                System.out.println("Undefined");
            }
    }
}
