package com.tecspeak.basics;

/**
 * Finds and prints common elements between two integer arrays.
 * <p>
 * Iterates through both arrays and prints elements that exist in both.
 * </p>
 *
 * @author TecSpeak
 */
public class CommonInTwoArray {

    /**
     * Finds and prints common elements present in both arrays.
     * <p>
     * Uses a nested loop to compare each element of the first array
     * against every element of the second array.
     * </p>
     *
     * @param arrOne the first array
     * @param arrTwo the second array
     */
    // FIX: Removed equal-length restriction and fixed inner loop boundary (j>0 → j>=0)
    public static void commomInTwoArray(int arrOne[], int arrTwo[]) {
        int lengthOne = arrOne.length;
        int lengthTwo = arrTwo.length;

        for (int i = 0; i < lengthOne; i++) {
            for (int j = lengthTwo - 1; j >= 0; j--) {
                if (arrOne[i] == arrTwo[j]) {
                    System.out.println(arrOne[i]);
                    break;
                }
            }
        }
    }

    /**
     * Main method to demonstrate finding common elements.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arrOne[] = {1, 2, 3, 4, 5, 1};
        int arrTwo[] = {5, 6, 2, 8, 9, 1};
        commomInTwoArray(arrOne, arrTwo);
    }
}
