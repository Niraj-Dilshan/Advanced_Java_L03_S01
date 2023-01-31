package com.ictec.threads;

import java.util.ArrayList;

public class CountDownTimerDemo {
    public static void main(String[] args) {
        Runnable flood,ignition,liftoff;
        CountDownTimer ct = new CountDownTimer();
        ArrayList<Runnable> events = new ArrayList<Runnable>();

        events.add(new LunchEvent("Flooding...!!!", 16));
        events.add(new LunchEvent("Ignition...!!!", 6));
        events.add(new LunchEvent("Liftoff...!!!", 0));

        Thread t1 = new Thread(ct);
        t1.start();

        for(Runnable r: events){
                new Thread(r).start();
        }

    }
}