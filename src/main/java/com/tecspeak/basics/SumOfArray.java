package com.tecspeak.basics;

/**
 * Calculates the sum of all elements in an integer array.
 *
 * @author TecSpeak
 */
public class SumOfArray {

    /**
     * Computes the sum of all integers in the array.
     *
     * @param arr the array to sum
     * @return the total sum
     */
    public static int sumOfArray(int arr[]) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Main method to demonstrate array summation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1, 2, 3, 4}));
    }
}
