package com.sa.omelet.CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mofijul on 7/18/2017.
 */
public class CollectionSolution {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(55);
        ar.add(12);

        for(int i=0;i<ar.size();i++){
            int temp = ar.get(i);
        }

        Collections.sort(ar);
        for(int temp: ar){
            System.out.println(temp);
        }

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("S124", 49));
        products.add(new Product("S111", 80));
        products.add(new Product("S89", 15));

        Collections.sort(products);
    }
}


class Product implements Comparable<Product>{

    public String productId;
    public double price;

    public Product(String productId, double price) {
        this.productId = productId;
        this.price = price;
    }

    @Override
    public int compareTo(Product product) {
        if(this.price > product.price){
            return 1;
        }
        else if(this.price < product.price) {
            return -1;
        }
        return 0;
    }
}














