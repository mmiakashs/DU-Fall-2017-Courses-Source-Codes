package com.sa.omelet.Thread;

/**
 * Created by mofijul on 7/18/2017.
 */
public class ThreadRunnable implements Runnable {

    Thread th;

    public ThreadRunnable() {
        th = new Thread(this,"hello");
    }

    @Override
    public void run() {

    }
}
