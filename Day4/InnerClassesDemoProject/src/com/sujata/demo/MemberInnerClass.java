package com.sujata.demo;

class Outer{

    private int value;
    class Inner{
        private int valueInner;
        public void showInner(){
            System.out.println("valueInner : "+valueInner);
            System.out.println("value : "+value);
        }
    }
    void showOuter(){
        int x=10;
        System.out.println("value : "+value);
        System.out.println("Local Method Variable x : "+x);
//        System.out.println("Value Inner : "+valueInner);
    }

}
public class MemberInnerClass {
    public static void main(String args[]){
    Outer outer=new Outer();
    Outer.Inner inner= outer.new Inner();
    inner.showInner();

    }
}
