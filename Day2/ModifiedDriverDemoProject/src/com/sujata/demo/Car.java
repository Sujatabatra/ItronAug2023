package com.sujata.demo;
/*
abstract can be a class or method
1. we can not instantiate abstract class
2. if we have even one method as abstract then its mandatory for us to mark class as abstract
 */
abstract public class Car {
    private String color,model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract public void engine();
}
