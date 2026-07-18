package com.tecspeak.basics;

/**
 * Finds pairs of elements in an array that sum to a specific target value.
 *
 * @author TecSpeak
 */
public class FindPairOFElement {

    /**
     * Prints all pairs of elements in the array whose sum equals the target.
     * <p>
     * Uses a nested loop to check every possible pair combination
     * without reusing the same element index twice.
     * </p>
     *
     * @param arr the array to search for pairs
     * @param x   the target sum value
     */
    public static void finfPairElement(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + x);
                }
            }
        }
    }

    /**
     * Main method to demonstrate finding pairs with a specific sum.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 5;
        finfPairElement(arr, x);
    }
}
