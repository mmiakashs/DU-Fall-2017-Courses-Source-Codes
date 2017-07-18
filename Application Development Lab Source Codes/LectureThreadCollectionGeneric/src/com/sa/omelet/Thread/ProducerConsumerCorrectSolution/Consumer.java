package com.sa.omelet.Thread.ProducerConsumerCorrectSolution;

/**
 * Created by mofijul on 7/18/2017.
 */
class Consumer implements Runnable {
  ProductListing productListing;

  Consumer(ProductListing productListing) {
    this.productListing = productListing;
    new Thread(this, "Consumer").start();
  }

  public void run() {
    while(true) {
      productListing.get();
    }
  }
}
