package com.sujata.demo.com.sujata.demo;

class Account implements Runnable{

    private static  int balance=1000;

    @Override
    public void run() {

        synchronized (Account.class) {
//        synchronized (this) {
            if (balance > 800) {
                System.out.println(Thread.currentThread().getName() + " you have sufficient balance to withdraw and you balance is Rs. " + balance);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                balance -= 800;
                System.out.println(Thread.currentThread().getName() + " you balance after withdraw is Rs." + balance);
            } else
                System.out.println(Thread.currentThread().getName() + " you don't have sufficient balance to withdraw and you balance is Rs. " + balance);

        }
    }
}
public class MyFourthDemoClass {
    public static void main(String args[]){
        Account a001=new Account();
        Account a002=new Account();
        Thread prateek=new Thread(a001,"Prateek");
        Thread amrit=new Thread(a002,"Amrit");

        prateek.start();
        amrit.start();
    }
}
