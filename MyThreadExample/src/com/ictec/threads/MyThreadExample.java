package com.ictec.threads;

public class MyThreadExample {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();

        MyThreadRunable run1 = new MyThreadRunable();
        Thread th3 = new Thread(run1);
        MyThreadRunable run2 = new MyThreadRunable();
        Thread th4 = new Thread(run2);

        th3.start();
        th4.start();
    }
}
