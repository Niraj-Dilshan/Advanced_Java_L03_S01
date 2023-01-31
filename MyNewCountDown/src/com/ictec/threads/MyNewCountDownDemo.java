package com.ictec.threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyNewCountDownDemo {
    public static void main(String[] args) {
        Runnable flood,ignite,lift;
        ScheduledThreadPoolExecutor mypool;

        mypool = new ScheduledThreadPoolExecutor(25);

        flood = new NewLaunchEvent("Flooding...!!!");
        ignite = new NewLaunchEvent("Ignite...!!!");
        lift = new NewLaunchEvent("Lift...!!!");

        for (int i = 20; i >= 0; i--) {
            mypool.schedule(new NewCountDown(i),20-i, TimeUnit.SECONDS);
        }
        mypool.schedule(flood,4l,TimeUnit.SECONDS);
        mypool.schedule(ignite,14l,TimeUnit.SECONDS);
        mypool.schedule(lift,20l,TimeUnit.SECONDS);
    }
}
