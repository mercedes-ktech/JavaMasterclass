package com.company;

import static com.company.ThreadColour.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN+"hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "hello there from the anonymous class implementation of run");

                try {
                    anotherThread.join(3000);
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out so i'm running again");
                } catch(InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE+"hello again from the main thread");
    }
}
