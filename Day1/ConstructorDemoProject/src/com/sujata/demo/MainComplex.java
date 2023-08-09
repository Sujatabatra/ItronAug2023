package com.sujata.demo;

public class MainComplex {
    public static void main(String args[]){
        Complex complex1=new Complex(5,7);
//        complex.setReal(5);
//        complex.setImagenary(8);

        complex1.displayComplexNumber();

//        Complex complex2=new Complex();
//        complex2.displayComplexNumber();
//
//        Complex complex3=new Complex(3);
//        complex3.displayComplexNumber();
//
        Complex complex4=new Complex(5,9);

//        Complex complex5=new Complex();
//        complex5.addComplexNumbers(complex1,complex4);


        complex4.displayComplexNumber();
//        complex5.displayComplexNumber();
        Complex complex6= complex1.add(complex4);
        complex6.displayComplexNumber();

    }
}
