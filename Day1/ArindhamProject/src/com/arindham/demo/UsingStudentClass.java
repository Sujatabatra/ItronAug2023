package com.arindham.demo;

import com.sujata.demo.Student;

public class UsingStudentClass {

    public static void main(String args[]){
        Student student=new Student();
        student.inputStudent(1,"ABC");
        student.displayStudent();

        System.out.println("==========================");

        Marks marks=new Marks();
        marks.inputStudentWithMarks(111,"XYZ",56,67,78);
        marks.displayStudentWithMarks();
    }
}
