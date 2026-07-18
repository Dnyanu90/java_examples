package com.tecspeak.basics;

import java.util.Arrays;

/**
 * Filters and prints only the even numbers from an integer array.
 *
 * @author TecSpeak
 */
public class PrintEvenNumberFromArray {

    /**
     * Iterates through the given array and prints numbers that are divisible by 2.
     *
     * @param arr the array to inspect
     */
    // FIX: Removed unused variables 'evenNumbers[]' and 'num'
    public static void printEvenNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Main method to demonstrate printing even numbers from an array.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arr[] = {34, 67, 12, 65, 39};
        printEvenNumber(arr);
    }
}
