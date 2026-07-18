package com.tecspeak.basics;

import java.util.Arrays;

/**
 * Generates the Fibonacci series up to a specified number of terms.
 * <p>
 * The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * Each term is the sum of the two preceding terms.
 * </p>
 *
 * @author TecSpeak
 */
public class Fibonacci {

    /** Default number of terms when no input is provided. */
    static int defaultNum;

    /** Number of terms to generate (used as fallback for 0 input). */
    static int num = 10;

    /* Static initializer to set default values. */
    static {
        num = 20;
        defaultNum = 2;
    }

    /**
     * Generates a Fibonacci series of {@code n} terms.
     * <p>
     * If n is 0, uses the class-level {@code num} default.
     * If n is negative, uses {@code defaultNum}.
     * </p>
     *
     * @param n the number of Fibonacci terms to generate
     * @return an array containing the first n Fibonacci numbers
     */
    public static int[] fibonacciSeries(int n) {

        if (n == 0) {
            n = num;
        }
        if (n < 0) {
            n = defaultNum;
        }

        int arr[] = new int[n];
        if (n >= 1) arr[0] = 0;
        if (n >= 2) arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    /**
     * Generates a Fibonacci series using a loop-based approach.
     * <p>
     * An alternative implementation that builds the series iteratively.
     * </p>
     *
     * @param n the number of terms to generate
     * @return an array containing the first n Fibonacci numbers
     */
    // FIX: Changed loop start from i=1 to i=0 so that i==0 condition is reachable
    public static int[] fibinacciSerisArr(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[0] = 0;
            } else if (i == 1) {
                arr[1] = 1;
            } else
                arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    /**
     * Main method to demonstrate Fibonacci series generation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Fibonacci.fibonacciSeries(-15)));
//        System.out.println(Arrays.toString(Fibonacci.fibinacciSerisArr(5)));
    }

}
