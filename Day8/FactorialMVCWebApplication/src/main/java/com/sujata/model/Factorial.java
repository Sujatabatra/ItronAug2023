package com.sujata.model;

public class Factorial {
    private int number,factorial;

    public Factorial(int number) {
        this.number = number;
    }

    public int getFactorial() {
        calculateFactorial();
        return factorial;
    }

    private void calculateFactorial(){
        factorial=1;
        while (number>=1)
            factorial*=number--;

    }
}
