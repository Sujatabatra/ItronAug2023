package com.sujata.training;

import com.sujata.demo.ReverseNumber;

public class Palindrom {
    private int number;
    private boolean palindrome;

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPalindrome() {
        checkPalindrom();
        return palindrome;
    }

    private void checkPalindrom(){
        ReverseNumber reverseNumber=new ReverseNumber();
        reverseNumber.setNumber(number);
        if(reverseNumber.getReverse()==number)
            palindrome=true;
    }
}
