package com.ictec.threads;

public class NewCountDown implements Runnable{
    public static int startAt;

    public NewCountDown(int startAt) {
        this.startAt = startAt;
    }

    @Override
    public void run() {
        System.out.println("T Minus " + startAt);
    }

}

