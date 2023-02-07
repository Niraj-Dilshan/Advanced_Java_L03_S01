import java.util.concurrent.locks.ReentrantLock;

public class CountDownClockLocked extends Thread{
    ReentrantLock lock = new ReentrantLock();
    public void run()
    {
        lock.lock();
        for (int t = 20; t >= 0; t--)
        {
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {}
        }
        lock.unlock();
    }
}
