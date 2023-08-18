package com.sujata.demo;

class FirstThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("Welcome to " + Thread.currentThread().getName()+" i : "+i);
        }
    }
}
public class MyFirstDemoClass {
    public static void main(String args[]){
    //New Born state
        FirstThread childThread=new FirstThread();

        childThread.start();  //Ready or Running


        for(int i=1;i<=5;i++) {
            System.out.println("Welcome " + Thread.currentThread().getName()+" i : "+i);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }

        //main thread
        childThread.run();

        System.out.println("Good Bye from "+Thread.currentThread().getName());
    }
}
