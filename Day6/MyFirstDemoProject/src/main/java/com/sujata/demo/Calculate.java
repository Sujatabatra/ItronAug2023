package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class Calculate {

    /*
    Requirement ID : R001
    1. divide two positive integers
    2. if any value is negative throw exception NegativeNumberException
    3. if denominator is zero throw ArithmeticException
     */
    public int divide(int number1,int number2) throws NegativeNumberException {
        if(number1>=0 && number2>=0)
            return number1/number2;
        else
            throw new NegativeNumberException("Divide is only Possible for Positive Integers");

    }

    /*
    Requirement ID : R002
    1. Adding two Positive Integers
    2. if any argument is negative throw NegativeNumberException
     */
    public int add(int number1,int number2){
        return 0;
    }
}
