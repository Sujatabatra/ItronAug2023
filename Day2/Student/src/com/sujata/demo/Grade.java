package com.sujata.demo;

public class Grade extends Marks{

    private double percentage;
    private String grade;

    public double getPercentage() {
        setPercentage();
        return percentage;
    }

    private void setPercentage() {
        this.percentage = (getMarks1()+getMarks2()+getMarks3())/3;
    }

    public String getGrade() {
        setPercentage();
        setGrade();
        return grade;
    }

    private void setGrade() {
        if(percentage>75)
            this.grade = "A Grade";
        else
            this.grade="B Grade";
    }
    public void displayStudentDetails(){

        displayStudentWithMarks();
        System.out.println("Percentage : "+getPercentage());
        System.out.println("Garde : "+getGrade());

    }

}
