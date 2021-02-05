package com.uzel;

import static com.uzel.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_BLACK + "Hello from main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("another thread");
        anotherThread.start(); //enable JVM to run the thread.
        // Cannot be started more than once. Create a new instance if needed.

        System.out.println(ANSI_BLACK + "Hello again from the main thread.");
        // This might print before anotherThread message.
        // We cannot assume an execution order.

        // Thread with anonymous class
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread.");
            }
        }.start();

        Thread myRunnable = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from overridden run () of MyRunnable");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "Another thread terminated or timed out");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I could not wait until another thread has finished.");
                }
            }
        });
        myRunnable.start();

        //anotherThread.interrupt();
        //Threads end when they return
    }

}
