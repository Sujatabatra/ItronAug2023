package com.sujata.demo;

public class StudentMain {
    public static void main(String args[]){
        Student student=new Student();
        student.inputStudent(101,"AAA");
        student.displayStudent();

        System.out.println("================");

        Grade grade=new Grade();
        grade.inputStudentWithMarks(1,"Amit",78,90,67);
        grade.displayStudentDetails();

    }
}
