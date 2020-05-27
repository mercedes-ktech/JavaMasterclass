import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyProducer producer = new MyProducer(buffer, ThreadColour.ANSI_BLUE);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColour.ANSI_CYAN);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColour.ANSI_GREEN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColour.ANSI_PURPLE + "I'm being printed from the Callable class");
                return "This is the callable result";
            }
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            System.out.println("Something went wrong");
        } catch (InterruptedException e) {
            System.out.println("Thread running the task was interrupted");
        }

        executorService.shutdown();
    }
}

class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String colour;

    public MyProducer(ArrayBlockingQueue<String> buffer, String colour) {
        this.buffer = buffer;
        this.colour = colour;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums) {
            try {
                System.out.println(colour + "Adding..." + num);
                buffer.put(num);
                try {
                    buffer.add(num);
                } finally {
                }
                Thread.sleep(random.nextInt(1000));

            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(colour + "Adding EOF and exiting...");
        try {
            buffer.put("EOF");
        } catch (InterruptedException e) {
        }
    }
}

class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String colour;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String colour) {
        this.buffer = buffer;
        this.colour = colour;
    }

    public void run() {

        while (true) {
            synchronized (buffer) {

                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(Main.EOF)) {
                        System.out.println(colour + "Exiting");
                        break;
                    } else {
                        System.out.println(colour + " Removed " + buffer.take());
                    }

                } catch (InterruptedException e) {

                }

            }

        }
    }
}