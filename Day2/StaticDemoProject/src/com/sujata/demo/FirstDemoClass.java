package com.sujata.demo;

public class FirstDemoClass {
    private int x;
    static private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        FirstDemoClass.y = y;
    }
}
