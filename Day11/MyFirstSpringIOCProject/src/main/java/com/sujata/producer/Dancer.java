package com.sujata.producer;

public class Dancer implements Performer{

    public Dancer(){
        System.out.println("Dancer Constructor");
    }
    @Override
    public void perform() {

        System.out.println("Dancer is dancing in JAZZ Style!");
    }
}
