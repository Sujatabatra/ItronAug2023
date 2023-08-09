package com.sujata.oop;

/*
Modifiable : setter
Readable : getter
 */
public class Factorial {
    /*
    number : modifiable (setter)
    factorial : readable (getter)
     */
    private int number,factorial;

    public void setNumber(int number /*local variable*/) {
        //current reference object.number=local variable
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getFactorial() {
        calculateFcatorial();
        return factorial;
    }

    private void calculateFcatorial(){
        //processing variable  : local variables in method
        int num=number;
        while(num>=1)
            factorial*=num--;

    }
}
