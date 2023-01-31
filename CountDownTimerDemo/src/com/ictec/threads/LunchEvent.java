package com.ictec.threads;

public class LunchEvent implements Runnable{
    private String massage;
    private int start;

    private int ctime;

    MyTimeMonitor mtm;

    public LunchEvent(String massage, int start, MyTimeMonitor mtm) {
        this.massage = massage;
        this.start = start;
        this.mtm = mtm;
    }

    @Override
    public void run() {
        boolean flag = false;
        while (!flag){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ctime = mtm.getTime();
            if (start == ctime){
                System.out.println(massage);
                flag = true;
            }
        }
//        mtm.getTime();
//        try {
//            Thread.sleep((CountDownTimer.startAt*1000)-(start*1000));
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(massage);
    }
}
