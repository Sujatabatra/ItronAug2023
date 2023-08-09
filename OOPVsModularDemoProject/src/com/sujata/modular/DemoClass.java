package com.sujata.modular;

public class DemoClass {
    static int number,factorial;

    static public void inputNumber(int num){
        number=num;
    }

    static public void calculateFactorial(){
        while(number>=1)
            factorial*=number--;
    }

    static public void displayFcatorial(){
    System.out.println("Fcatorial : "+factorial);
    }

    public static void main(String args[]){
        inputNumber(4);
        calculateFactorial();
        factorial=1; //logical error
        displayFcatorial();
    }
}
