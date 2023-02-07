package com.ictec.threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MySyncTimerDemo {
    public static void main(String[] args) {
        CountDownClockSync clock = new CountDownClockSync(20);
        ScheduledThreadPoolExecutor mypool = new ScheduledThreadPoolExecutor(2);

        mypool.execute(clock);
        mypool.execute(clock);

        mypool.shutdown();
    }

}
