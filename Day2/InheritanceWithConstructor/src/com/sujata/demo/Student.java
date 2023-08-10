package com.sujata.demo;

public class Student {
    private int rollNo;
    private String name;

    public Student(){
        System.out.println("Hi I am Student Class Default Constructor");
    }


    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputStudent(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public void displayStudent(){
        System.out.println("Roll No : "+rollNo);
        System.out.println("Name : "+name);
    }
}
