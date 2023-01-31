package com.ictec.threads;

public class CountDownTimerDemo {
    public static void main(String[] args) {
        Runnable flood,ignition,liftoff;
        CountDownTimer ct = new CountDownTimer();
        flood = new LunchEvent("Flooding...!!!",16);
        ignition = new LunchEvent("Ignition...!!!",6);
        liftoff = new LunchEvent("Liftoff...!!!",0);
        Thread t1 = new Thread(ct);
        Thread tf = new Thread(flood);
        Thread ti = new Thread(ignition);
        Thread tl = new Thread(liftoff);

        t1.start();
        tf.start();
        ti.start();
        tl.start();
    }
}