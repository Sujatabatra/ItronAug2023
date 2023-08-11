package com.sujata.demo;

import java.util.Scanner;

public class AgeInputClassMain {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
    try {
        AgeInputClass ageInputClass = new AgeInputClass();
        System.out.println("Enter Age for setter method");
        ageInputClass.setAge(scanner.nextInt());

        System.out.println("Age Entered : " + ageInputClass.getAge());

        System.out.println("Enter Age for constructor initialization");
        AgeInputClass ageInputClass1 = new AgeInputClass(scanner.nextInt());
    }
    catch (AgeUnCheckedException exception){
        System.out.println("Age must be greater than 18 by Age UncheckedException");
    }
    catch (AgeCheckedException exception){
        System.out.println("Age must be greater than 18 by Age CheckedException");
    }
    }
}
