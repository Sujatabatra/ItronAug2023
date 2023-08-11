package com.sujata.demo;

import java.util.Scanner;

public class FirstDemoClass {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter First Number : ");
            int number1 = scanner.nextInt();
            System.out.println("Enter Second Number : ");
            int number2 = scanner.nextInt();

            int divide = number1 / number2;

            System.out.println("Division Result : " + divide);
        }
        catch (ArithmeticException exception){
            System.out.println("Undefined");
        }
        System.out.println("Good Bye From Main!");
    }
}
