package com.sujata.demo;
/*
1. Constructors have same name as that of class name
2. Constructors don't have return type not even void
3. Constructors can be argumented as well as non argumented
4. Constructors can exist in any scope i.e private,default,protected,public
========================================
Note : If the class is constructor challenged
 then Compiler will going to create one default(Zero Argument) Constructor for us.
 */
public class Complex {
    private int real,imagenary;

    /*
    Constructor Overloading : Every Constructor will be differentiated from each other wrt its signature
    Signature means : Number, Type and Sequence of Arguments
     */
    public Complex(int real,int imagenary){
        this.real=real;
        this.imagenary=imagenary;
    }

    private Complex(){

    }

    public Complex(int real){
        this.real=real;
    }
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImagenary() {
        return imagenary;
    }

    public void setImagenary(int imagenary) {
        this.imagenary = imagenary;
    }

    public void displayComplexNumber(){
        System.out.print(real);
        if(imagenary>0)
            System.out.println("+"+imagenary+"i");
        else if(imagenary<0)
            System.out.println(imagenary+"i");
    }

//    public void addComplexNumbers(Complex complex1,Complex complex2){
//        real=complex1.real+complex2.real;
//        imagenary=complex1.imagenary+complex2.imagenary;
//    }

    public Complex add(Complex complex1){
        Complex sum=new Complex();
        sum.real = real + complex1.real;
        sum.imagenary=imagenary+complex1.imagenary;
        return sum;
    }
}
