package com.tecspeak.multithreading;
/**
 * Problem Statement:
 * Write a Java program to demonstrate multithreading (e.g., create and run multiple threads
 * using different thread life cycle methods).
 *
 * Logic:
 * 1. Extend the Thread class to create custom thread worker classes.
 * 2. Override the run() method to specify the executing task.
 * 3. Use thread lifecycle methods: start(), Thread.sleep() (TIMED_WAITING), yield(), and join() (WAITING).
 *
 * @author Java Developer
 */
class WorkerThread extends Thread {
    WorkerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(getName() + " running - Step " + i);
            try {
                // Moving thread to TIMED_WAITING state
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread("Thread-1");
        WorkerThread t2 = new WorkerThread("Thread-2");
        WorkerThread t3=new WorkerThread("Thread-3");

        // NEW state to RUNNABLE state transition
        t1.start();
        t2.start();
        t3.start();


//        try {
//            // Main thread waits for t1 to complete execution
//            t1.join();
//            System.out.println("Thread-1 finished execution.");
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }

        System.out.println("Main thread finished execution.");
    }
}
