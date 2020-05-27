import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        Thread t1 = new Thread(new Worker(ThreadColour.ANSI_RED), "Priority 10");
        Thread t2 = new Thread(new Worker(ThreadColour.ANSI_BLUE), "Priority 8");
        Thread t3 = new Thread(new Worker(ThreadColour.ANSI_GREEN), "Priority 6");
        Thread t4 = new Thread(new Worker(ThreadColour.ANSI_CYAN), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColour.ANSI_PURPLE), "Priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static class Worker implements Runnable {
        private int runCount = 1;
        private String threadColour;

        public Worker(String threadColour) {
            this.threadColour = threadColour;
        }

        @Override
        public void run() {
           for(int i = 0; i < 100; i++) {
               lock.lock();
               try {
                   System.out.format(threadColour + "%s: runCount =%d\n", Thread.currentThread().getName(), runCount++);
                   //execute critical section of code
               } finally {
                   lock.unlock();
               }
           }
        }
    }
}
