package com.tecspeak.basics;

/**
 * Finds the second largest number in an array.
 *
 * @author TecSpeak
 */
public class SecondLargestNumber {

    /**
     * Determines and prints the second largest number in the array.
     * <p>
     * Iterates through the array, maintaining both the largest and
     * second largest values found so far.
     * </p>
     *
     * @param arr the array to search
     */
    public static void secondLargestNumber(int arr[]) {

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }

    /**
     * Main method to demonstrate finding the second largest number.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 7, 8};
        secondLargestNumber(arr);
    }
}