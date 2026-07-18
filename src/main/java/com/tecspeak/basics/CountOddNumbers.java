package com.tecspeak.basics;

/**
 * Counts the number of odd numbers in an integer array.
 *
 * @author TecSpeak
 */
public class CountOddNumbers {

    /**
     * Counts how many odd numbers exist in the given array.
     * <p>
     * A number is odd if it is not divisible by 2 (i.e., {@code num % 2 != 0}).
     * </p>
     *
     * @param arr the array of integers to inspect
     * @return the count of odd numbers in the array
     */
    public static int countOddNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Main method to demonstrate counting odd numbers.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(countOddNumbers(new int[]{8, 3, 6, 2, 5, 7}));
    }
}
