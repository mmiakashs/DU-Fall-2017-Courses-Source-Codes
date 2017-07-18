package com.sa.omelet.Thread;

/**
 * Created by mofijul on 7/18/2017.
 */
public class Solution {
    public static void main(String[] args) {

//        Thread mainThread = Thread.currentThread();
//        mainThread.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(mainThread);
//        System.out.println(mainThread.getName());

        Counter counter = new Counter();
        counter.total=0;

        MyThread myThread1= new MyThread("OEC1",0,100,counter);
        MyThread myThread2= new MyThread("OEC2",101,200,counter);

        myThread1.start();
        myThread2.start();

        ThreadRunnable thR = new ThreadRunnable();
        thR.th.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main thread excution complete");

    }
}

