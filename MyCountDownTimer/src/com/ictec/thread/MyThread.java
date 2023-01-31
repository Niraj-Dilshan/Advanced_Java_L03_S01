package com.ictec.thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 20; i>=0;i--){
            System.out.println("T minus "+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}
