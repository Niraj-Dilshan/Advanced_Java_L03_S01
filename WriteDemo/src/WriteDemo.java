public class WriteDemo {
    public static void main(String[] args)
    {
        final Pen myPen =new Pen();
        final Paper myPaper =new Paper();

        Thread t1 = new Thread() {
            public void run()
            {
                synchronized(myPen)
                {
                    System.out.println("Thread1 is holding Pen");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        // do something
                    }
                    synchronized(myPaper)
                    {
                        System.out.println("Requesting for Paper");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run()
            {
                synchronized(myPaper)
                {
                    System.out.println("Thread2 is holding Paper");
                    try {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        // do something
                    }
                    synchronized(myPen)
                    {
                        System.out.println("Requesting for Pen");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}