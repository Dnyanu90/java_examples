package com.tecspeak.basics;

/**
 * Finds the Greatest Common Divisor (GCD) for an array of integers.
 * <p>
 * Evaluates the GCD cumulatively across all elements in the array
 * using the Euclidean algorithm.
 * </p>
 *
 * @author TecSpeak
 */
public class FindGCDInArray {

    /**
     * Computes the GCD of two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor
     */
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Main method demonstrating GCD calculation for an array.
     * <p>
     * Iterates through the array, computing the GCD of the current result
     * with the next element.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
     public static void main(String[] args) {
        int[] arr = {4, 8, 6};

        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            ans = gcd(ans, arr[i]);
        }

        System.out.println(ans);
    }
}
