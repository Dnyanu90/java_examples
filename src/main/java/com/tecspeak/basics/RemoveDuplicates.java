package com.tecspeak.basics;

import java.util.Arrays;

/**
 * Removes duplicate elements from an array by building a new, distinct array.
 *
 * @author TecSpeak
 */
public class RemoveDuplicates {

    /**
     * Filters out duplicate numbers and prints a new array with unique values.
     * <p>
     * Creates an empty dynamic array, checks if each element of the input array
     * already exists in the new array. If not, the new array is resized and the
     * element is added. Note: Using a Set is generally preferred for this task in Java.
     * </p>
     *
     * @param arr the input array containing potential duplicates
     */
    public static void removeduplicates(int arr[]) {
        int finalArray[] = new int[]{};
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            boolean isExists = false;

            for (int j = 0; j < finalArray.length; j++) {
                if (num == finalArray[j]) {
                    isExists = true;
                    break;
                }
            }

            if (!isExists) {
                finalArray = Arrays.copyOf(finalArray, finalArray.length + 1);
                finalArray[finalArray.length - 1] = num;
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }

    /**
     * Main method to demonstrate removing duplicates.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        RemoveDuplicates.removeduplicates(new int[]{5, 7, 4, 3, 56, 7});
    }
}
