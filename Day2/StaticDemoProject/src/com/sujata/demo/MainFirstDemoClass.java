package com.sujata.demo;

public class MainFirstDemoClass {
    static int x;
    int y;
    public static void main(String args[]){
        x=10;
        MainFirstDemoClass mainFirstDemoClass=new MainFirstDemoClass();
        mainFirstDemoClass.y=20;

//        FirstDemoClass.y=10;
            FirstDemoClass.setY(10);
            System.out.println(FirstDemoClass.getY());

            FirstDemoClass obj1=new FirstDemoClass();

        FirstDemoClass obj2=new FirstDemoClass();

    }
}
