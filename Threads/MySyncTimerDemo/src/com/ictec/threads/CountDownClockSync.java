package com.ictec.threads;

public class CountDownClockSync extends Thread {
    private int start;

    public CountDownClockSync(int start) {
        this.start = start;
    }

    @Override
    public synchronized void run(){
        for (; start >= 0 ; start--) {
            System.out.println("T minus "+ start);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
