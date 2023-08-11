package com.sujata.demo;

public class AgeInputClass {

    private int age;

    public AgeInputClass(){

    }
    public AgeInputClass(int age)throws AgeCheckedException {
        if(age<18){
            throw new AgeCheckedException("Age must be greater then 18");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18){
            throw new AgeUnCheckedException("Age should not be less then 18");
        }
        this.age = age;
    }


}
