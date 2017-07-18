package com.sa.omelet.Thread.ProducerConsumerIncorrectSolution;

/**
 * Created by mofijul on 7/18/2017.
 */
class ProductListing {
    int n;

    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put: " + n);
    }
}
