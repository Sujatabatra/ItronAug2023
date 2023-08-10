package com.sujata.demo;

public class Rectangle implements Shape,NonRoundedShape{
    private int length,breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void perimeter() {
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter of Rectangle : "+perimeter);
    }

    @Override
   public void area() {
        int area=length*breadth;
        System.out.println("Area of Rectangle : "+area);

    }
}
