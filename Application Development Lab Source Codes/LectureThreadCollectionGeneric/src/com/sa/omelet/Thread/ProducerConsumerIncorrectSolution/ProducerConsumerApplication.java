package com.sa.omelet.Thread.ProducerConsumerIncorrectSolution;

class ProducerConsumerApplication {
    public static void main(String args[]) {
        ProductListing productListing = new ProductListing();
        new Producer(productListing);
        new Consumer(productListing);

        System.out.println("Press Control-C to stop.");
    }
}

