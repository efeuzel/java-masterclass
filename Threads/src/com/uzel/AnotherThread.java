package com.uzel;

import static com.uzel.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "a thread woke up another thread");
            return;
        }

        System.out.println(ANSI_BLUE + "Another thread woke up after waiting seconds.");
    }
}
