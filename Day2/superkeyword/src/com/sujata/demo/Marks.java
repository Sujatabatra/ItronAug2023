package com.sujata.demo;

public class Marks extends Student {

    private int marks1,marks2,marks3;
    public Marks(){
        //implicit call to base class default constructor
        /*
        if default constructor is not present in Base class,
        then give explicit call to the available constructor using super keyword
         */
//        super(1,"AAA");
        System.out.println("Hi I am Marks Class Default Constructor");
    }

    public Marks(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public void inputStudent(int rollNo, String name, int marks1, int marks2, int marks3){
        inputStudent(rollNo,name);
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }

    public void displayStudent(){
        super.displayStudent();
        System.out.println("Marks 1 : "+marks1);
        System.out.println("Marks 2 : "+marks2);
        System.out.println("Marks 3 : "+marks3);
    }

}
