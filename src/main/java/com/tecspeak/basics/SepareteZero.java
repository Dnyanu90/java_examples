package com.tecspeak.basics;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Separates zeroes from non-zero elements in an array.
 * <p>
 * Moves all non-zero elements to the front and all zeroes to the end.
 * </p>
 *
 * @author TecSpeak
 */
public class SepareteZero {

    /**
     * Segregates all zeroes in the array to the end while maintaining the order
     * of non-zero elements. Prints the resulting array.
     *
     * @param arr the array to process
     */
    public static void separateZero(int arr[]) {

//        int result[] = new int[arr.length];
//        int k = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                result[k] = arr[i];
//                k++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                result[k] = arr[i];
//                k++;
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        int[] result = IntStream.concat(
                Arrays.stream(arr).filter(n -> n != 0),
                Arrays.stream(arr).filter(n -> n == 0)
        ).toArray();

        System.out.println(Arrays.toString(result));
    }

    /**
     * Main method to demonstrate zero separation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3};

        separateZero(arr);
    }
}
