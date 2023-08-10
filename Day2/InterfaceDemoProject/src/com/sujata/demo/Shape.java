package com.sujata.demo;

/*
All methods in an interface are public abstract
All vraibale are public final abstract
 */
public interface Shape {
    void area();

    default void volume(){
        System.out.println("This methos is not supported for this shape");
    }
}
