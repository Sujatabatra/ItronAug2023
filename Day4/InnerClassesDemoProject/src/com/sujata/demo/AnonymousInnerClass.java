package com.sujata.demo;

class PopCorn{
    public void pop(){
        System.out.println("PopCorn Popping");
    }

    public void price(){
        System.out.println("Kindly Pay for PopCorn");
    }
}
public class AnonymousInnerClass {
    public static void main(String args[]){

        PopCorn butterPopCorn=new PopCorn(){
            @Override
            public void pop(){
                System.out.println("Butter PopCorn Popping");
            }

            @Override
            public void price(){
                System.out.println("Kindly Pay for Butter PopCorn");
            }
        };

        butterPopCorn.pop();
        butterPopCorn.price();
    }
}
