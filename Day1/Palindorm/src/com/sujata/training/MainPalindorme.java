package com.sujata.training;

import java.util.Scanner;

public class MainPalindorme {
    public static void main(String args[]){
        Palindrom palindrom=new Palindrom();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number=scanner.nextInt();

        palindrom.setNumber(number);
        System.out.println(number+" is palindrome "+palindrom.isPalindrome());

        if(palindrom.isPalindrome())
            System.out.println("Mirrored Number");
        else
            System.out.println("Not Mirrored Number");
    }
}
