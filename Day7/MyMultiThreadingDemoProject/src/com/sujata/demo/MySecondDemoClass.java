package com.sujata.demo;

class SecondThread extends Thread{

    public SecondThread(){

    }

    public SecondThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("Welcome to " + Thread.currentThread().getName()+" i : "+i);
        }
    }
}
public class MySecondDemoClass {
    public static void main(String args[]){

        SecondThread childThread1=new SecondThread();  //thread-0
        SecondThread childThread2=new SecondThread();  //thread-1
        SecondThread childThread3=new SecondThread("Third Thread");  //Thread 3
        SecondThread childThread4=new SecondThread(); //thread-2

//        childThread3.setName("Third Thread");

        childThread1.start(); //thread-0
        childThread2.start();  //thread-1
        childThread3.start();  //Third Thread
        childThread4.start();  //thread-2

        for(int i=1;i<=5;i++) {
            System.out.println("Welcome " + Thread.currentThread().getName()+" i : "+i);
        }

        System.out.println("Good Bye from "+Thread.currentThread().getName());
    }
}
