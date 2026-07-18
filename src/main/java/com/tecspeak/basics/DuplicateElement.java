package com.tecspeak.basics;

/**
 * Finds and prints duplicate elements in an integer array.
 * <p>
 * Uses a nested loop approach to compare each element with
 * subsequent elements to detect duplicates.
 * </p>
 *
 * @author TecSpeak
 */
public class DuplicateElement {

    /**
     * Finds and prints duplicate elements in the given array.
     * <p>
     * Compares each element with all elements after it.
     * If a match is found, the duplicate value is printed.
     * </p>
     *
     * @param arr the array to search for duplicates
     */
    // FIX: Changed inner loop start from j=i to j=i+1 to avoid comparing element with itself
    public static void duplicateElementInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

    }

    /**
     * Main method to demonstrate duplicate element detection.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 3};
        duplicateElementInArray(arr);
    }
}