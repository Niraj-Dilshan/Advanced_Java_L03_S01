package com.ictec.threads;

public class CountDownTimer implements Runnable{

    public static int startAt = 20;

    @Override
    public void run() {
        for (int i = startAt; i >= 0; i--) {
            System.out.println("T Minus " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
