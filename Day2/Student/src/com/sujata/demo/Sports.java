package com.sujata.demo;

public class Sports extends Student{
    private String sportName;

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public void inputStudentWithSportDetails(int rollNo,String name,String sportName){
        inputStudent(rollNo,name);
        this.sportName=sportName;
    }

    public void displayStudentWithSportDetail(){
        displayStudent();
        System.out.println("Sports Name : "+sportName);
    }
}
