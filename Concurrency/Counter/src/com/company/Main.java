package com.company;

public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountDownThread t1 = new CountDownThread(countdown);
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();

    }


}

class Countdown {

    private int i;

    public void doCountDown() {
        String colour;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                colour = ThreadColour.ANSI_CYAN;
                break;
            case "Thread 2":
                colour = ThreadColour.ANSI_PURPLE;
                break;
            default:
                colour = ThreadColour.ANSI_GREEN;
        }


        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(colour + Thread.currentThread().getName() + ": i = " + i);
            }
        }

    }
}

class CountDownThread extends Thread {
    private Countdown threadCountdown;

    public CountDownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountDown();
    }
}