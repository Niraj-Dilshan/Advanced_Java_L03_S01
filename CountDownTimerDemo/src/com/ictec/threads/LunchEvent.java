package com.ictec.threads;

public class LunchEvent implements Runnable{
    private String massage;
    private int start;

    public LunchEvent(String massage, int start) {
        this.massage = massage;
        this.start = start;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((CountDownTimer.startAt*1000)-(start*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(massage);
    }
}
