package com.sujata.misc;

import com.sujata.entity.Person;

public class PersonMain {
    public static void main(String args[]){

        int i=10;
        int j=10;
        if(i==j)
            System.out.println("i and j are equal");
        else
            System.out.println("i and j are not equal");

        Person p1=new Person(1,"AAA",23);
        Person p2=new Person(1,"AAA",23);

        //== : checkes wheather two objects pointing to same object or not
        if(p1==p2)
            System.out.println(p1+" and "+p2+" are equal");
        else
            System.out.println(p1+" and "+p2+" are not equal");

        Person p3=p2;

        if(p3==p2)
            System.out.println(p3+" and "+p2+" are equal");
        else
            System.out.println(p3+" and "+p2+" are not equal");


        if(p1.equals(p2))
            System.out.println(p1+" and "+p2+" are equal");
        else
            System.out.println(p1+" and "+p2+" are not equal");
    }

}
