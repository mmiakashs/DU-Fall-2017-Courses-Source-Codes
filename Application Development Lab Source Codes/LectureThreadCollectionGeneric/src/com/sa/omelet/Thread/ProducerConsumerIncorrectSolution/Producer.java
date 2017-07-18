package com.sa.omelet.Thread.ProducerConsumerIncorrectSolution;

class Producer implements Runnable {
    ProductListing productListing;

    Producer(ProductListing productListing) {
        this.productListing = productListing;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;

        while(true) {
            productListing.put(i++);
        }
    }
}

