package com.tecspeak.basics;

import java.util.Arrays;
import java.util.List;

/**
 * Reverses the elements of an integer array.
 *
 * @author TecSpeak
 */
public class ReverseArray {

    /**
     * Creates a new array and stores the elements of the input array in reverse order.
     * <p>
     * Iterates backwards over the original array while iterating forwards over
     * the new array.
     * </p>
     *
     * @param arr the array to reverse
     */
    public static void reverseArray(Integer arr[]) {
//        int reverse[] = new int[arr.length];
//
//        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
//
//            reverse[j] = arr[i];
//
//
//        }
        List<Integer> integerList = Arrays.asList(arr).reversed();

//        Collections.reverse(Arrays.asList(arr));
        System.out.println(integerList.toString());

    }

    /**
     * Main method to demonstrate array reversal.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Integer arr[] = {5, 7, 4, 3, 56, 7};
        reverseArray(arr);
    }
}
