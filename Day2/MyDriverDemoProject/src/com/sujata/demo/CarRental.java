package com.sujata.demo;

public class CarRental {
    public static void main(String args[]){
        Car bmw=new BMW("Black","Q6");
        Audi audi=new Audi("Red","A8");
        Toyota toyota=new Toyota("Golden","Altis");

        Driver sonu=new Driver("Sonu");
        Driver ramesh=new Driver("Ramesh");
        Driver suresh=new Driver("Suresh");

        sonu.setCar(bmw);
        sonu.drive();
    }
}
