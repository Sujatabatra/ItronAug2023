package com.sujata.demo;

public class Circle implements RoundedShape{
    private double radius,circumference,area;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void circumference() {
        circumference=2*RoundedShape.PI*radius;
    }

    @Override
    public void area() {
        area = RoundedShape.PI*radius*radius;
    }

    @Override
    public void displayResults() {
        System.out.println("Area of Circle : "+area);
        System.out.println("Circumference of Circle :  "+circumference);
    }
}
