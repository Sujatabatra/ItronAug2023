package com.example.factorialdemoproject;
public class Factorial {

    public long calculateFactorial(int number){
        long factorial=1L;
        while(number>=1)
            factorial*=number--;
        return factorial;
    }
}
