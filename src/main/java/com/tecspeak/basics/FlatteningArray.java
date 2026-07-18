package com.tecspeak.basics;

import java.util.Arrays;

/**
 * Demonstrates how to flatten a 2D array into a 1D array.
 *
 * @author TecSpeak
 */
public class FlatteningArray {

    /**
     * Flattens a predefined 2D array into a 1D array.
     * <p>
     * First counts the total number of elements to initialize the 1D array,
     * then iterates through the 2D array again to copy the elements.
     * </p>
     *
     * @return a 1D array containing all elements from the 2D array
     */
    // FIX: Changed twoD.length to twoD[i].length in inner loops for jagged array safety
    public static int[] flatteningArray() {
        int sizeOfArray = 0;
        int twoD[][] = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                sizeOfArray++;
//                System.out.print(twoD[i][j]);
            }
        }

        int arr1[] = new int[sizeOfArray];
        int k = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                arr1[k] = twoD[i][j];
                k++;
            }
        }

        return arr1;
    }

    /**
     * Main method to demonstrate array flattening.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(FlatteningArray.flatteningArray()));
    }
}
