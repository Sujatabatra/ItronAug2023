package com.sujata.demo;

class Base{
    int value;

    public Base(int value) {
        this.value = value;
    }
}

class Derived extends Base{
    int value;

    public Derived(int value, int value1) {
        super(value);
        this.value = value1;
    }

    public void checkGreater(){
        if(super.value>value)
            System.out.println(super.value+" is greater");
        else
            System.out.println(value+" is greater");
    }
}
public class SuperKeywordDemoClass {
    public static void main(String args[]){
    Derived derived=new Derived(10,20);
    derived.checkGreater();

    }
}
