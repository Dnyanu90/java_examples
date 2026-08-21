package com.tecspeak.basics;

/**
 * Finds the missing number in an array sequence.
 *
 * @author TecSpeak
 */
public class MissingNumber {

    /**
     * Finds and prints the first missing positive integer in the sequence.
     * <p>
     * Determines the maximum value in the array, then checks each integer
     * from 1 to max to see if it exists in the array. Prints the first
     * missing number found.
     * </p>
     *
     * @param arr the array to search
     */
    public static void findMissing(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 1; i <= max; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing number: " + i);
                break;
            }
        }
    }

    /**
     * Main method to demonstrate finding a missing number.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7};
        findMissing(arr);
    }
}