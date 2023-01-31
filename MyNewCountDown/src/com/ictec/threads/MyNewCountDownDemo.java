package com.ictec.threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MyNewCountDownDemo {
    public static void main(String[] args) {
        Runnable flood,ignite,lift;
        ScheduledThreadPoolExecutor mypool;

        mypool = new ScheduledThreadPoolExecutor(25);

        flood = new NewLaunchEvent("Flooding...!!!");
        ignite = new NewLaunchEvent("Ignite...!!!");
        lift = new NewLaunchEvent("Lift...!!!");
    }
}
