import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MyLockTimerDemo {

    public static void main(String[] args)
    {
        ScheduledThreadPoolExecutor myPool = new ScheduledThreadPoolExecutor(2);
        CountDownClockLocked clock = new CountDownClockLocked();

        myPool.execute(clock);
        myPool.execute(clock);
        myPool.shutdown();
    }
}
