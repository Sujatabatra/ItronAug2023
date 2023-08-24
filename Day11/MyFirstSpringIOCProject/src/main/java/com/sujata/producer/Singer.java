package com.sujata.producer;

public class Singer implements Performer{

    public Singer(){
        System.out.println("Singer Constructor");
    }
    @Override
    public void perform() {
        System.out.println("Singer is singing LALALALA!");
    }
}
