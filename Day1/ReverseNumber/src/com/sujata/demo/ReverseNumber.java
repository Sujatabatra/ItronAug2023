package com.sujata.demo;
public class ReverseNumber {
    private int number;
    private int reverse;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getReverse() {
        calculateReverse();
        return reverse;
    }

    private void calculateReverse(){
        while(number!=0){
            reverse=reverse*10+number%10;
            number/=10;
        }
    }
}
