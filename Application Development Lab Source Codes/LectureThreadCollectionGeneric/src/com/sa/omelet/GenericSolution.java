package com.sa.omelet;

/**
 * Created by akashs on 8/2/17.
 */
public class GenericSolution {

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
        int a=0;
        for(T tm: ar){
            System.out.println(tm);
        }
    }

    public static void main(String[] args) {
        Integer[] ar = new Integer[3];
        ar[0] = 1;ar[1] = 2;ar[2] = 5;
        printGenArray(ar);

        Double[] arD = new Double[3];
        arD[0] = 1.2;arD[1] = 2.3;arD[2] = 5.7;
        printGenArray(ar);

        GenArray<Integer> genArray = new GenArray<>();
    }
}



class GenArray<TM>{

}





