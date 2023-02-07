package com.ictec.threads;

public class CountDownTimer implements Runnable, MyTimeMonitor{

    public static int startAt;

    public CountDownTimer(int startAt) {
        this.startAt = startAt;
    }

    @Override
    public void run() {
        for (; startAt >= 0; startAt--) {

            System.out.println("T Minus " + startAt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public int getTime() {
        return startAt;
    }
}
