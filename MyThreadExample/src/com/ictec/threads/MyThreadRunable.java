package com.ictec.threads;

public class MyThreadRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<11; i++){

            System.out.println("Number is : " + i);

        }
    }
}
