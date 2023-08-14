package com.sujata.demo;

class MyOuter{

    private int value;
    private static int anotherValue;
    static class Inner{
        private int valueInner;
        public void showInner(){
            System.out.println("valueInner : "+valueInner);
            System.out.println("anotherValue : "+anotherValue);
//            System.out.println("value : "+value);
        }
    }
    void showOuter(){
        int x=10;
        System.out.println("value : "+value);
        System.out.println("Local Method Variable x : "+x);
//        System.out.println("Value Inner : "+valueInner);
    }
}
public class NestedInnerClass {
    public static void main(String args[]){
    MyOuter.Inner inner=new MyOuter.Inner();
    inner.showInner();
    }
}
