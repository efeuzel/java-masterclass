package com.uzel;
import static com.uzel.ThreadColor.ANSI_BLACK;
import static com.uzel.ThreadColor.ANSI_GREEN;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_BLACK + "Hello from main thread.");

        Thread anotherThread = new AnotherThread();
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

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        //Threads end when they return
    }

}
