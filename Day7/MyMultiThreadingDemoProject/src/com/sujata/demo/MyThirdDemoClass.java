package com.sujata.demo;

class InputNumber{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

class FactorialJob extends InputNumber implements Runnable{
    private long factorial;

    public FactorialJob(int number){
        setNumber(number);
    }
    public long getFactorial() {
        int number=getNumber();
        factorial=1;
        while(number>=1)
            factorial*=number--;
        return factorial;
    }

    @Override
    public void run() {
        System.out.println("Factorial of "+getNumber()+" : "+getFactorial()+" calculated by "+Thread.currentThread().getName());
    }
}
public class MyThirdDemoClass {
    public static void main(String args[]){

        Thread childThread1=new Thread(new FactorialJob(4));

        Thread childThread2=new Thread(new FactorialJob(6));

        Thread childThread3=new Thread(new FactorialJob(7));


        childThread1.start();
        childThread2.start();
        childThread3.start();
    }

}
