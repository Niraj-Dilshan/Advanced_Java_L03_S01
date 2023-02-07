public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("First Thread");
        MyThread mt2 = new MyThread("Second Thread");

        //Without join
        //mt1.start();
        //mt2.start();

        //With join
        mt1.start();
        try {
            mt1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        mt2.start();

        //try with .join(time)
    }

}
