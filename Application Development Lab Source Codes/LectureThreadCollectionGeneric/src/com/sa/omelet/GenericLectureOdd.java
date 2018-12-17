package com.sa.omelet;

/**
 * Created by akashs on 8/3/17.
 */
public class GenericLectureOdd {

    public static void printArray(Integer[] ar){
        for(Integer tm: ar){
            System.out.println(tm);
        }
    }

    public static void printArray(Double[] ar){
        for(Double tm: ar){
            System.out.println(tm);
        }
    }

    public static <T,M> void printGenArray(T[] ar){
        int in=0;
        for(T tm: ar){
            System.out.println(tm);
        }
    }

    public static void main(String[] args) {
        Integer[] ar = {10,20,15};
        printGenArray(ar);

        Double[] arD = {10.5,20.25,15.7};
        printGenArray(arD);

        GenClass<Integer> genClass = new GenClass<Integer>();
    }
}

class GenClass<T extends Comparable<Number>>{
    public void printGenArray(T[] ar){
        for(T tm: ar){
            System.out.println(tm);
        }
    }
}








