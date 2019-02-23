package com.company;

import java.util.stream.IntStream;

public class Main {
    private static int bruteforce(int m, int n, int limit){
        int min = Math.min(m, n);
        int sum = 0;
        for (int x = min; x < limit ; x++) {
            if (x % m == 0 || x % n == 0){
                sum += x;
            }
        }
        return sum;
    }

    private static int functionalBruteforce(int m, int n, int limit){
        //takes the smallest int value, so that it can start, iterating from the start
        int min = Math.min(m, n);

        //The IntStream basicaly loops from the min-value to the limit integer,
        
        return IntStream.range(min, limit).
                filter(w -> w % m == 0 || w % n == 0).
                reduce(0,Integer::sum);
    }


    public static void main(String[] args) {

        System.out.println(bruteforce(-3,-5,1000));
        System.out.println(functionalBruteforce(3,5,1000));

    }
}
