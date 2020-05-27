package com.company;

import static com.company.ThreadColour.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "hello from MyRunnable's implementation of run()");
    }
}
