package com.tecspeak.basics;

/**
 * Compares two integer arrays for equality.
 * <p>
 * Two arrays are considered equal if they have the same length
 * and identical elements at every index position.
 * </p>
 *
 * @author TecSpeak
 */
public class CheckTwoArray {

    /**
     * Checks if two integer arrays are identical.
     * <p>
     * First checks if lengths match, then compares each element at the same index.
     * </p>
     *
     * @param arrOne the first array to compare
     * @param arrTwo the second array to compare
     * @return {@code true} if both arrays have the same length and identical elements
     */
    public static boolean checkTwoArray(int arrOne[], int arrTwo[]) {
        boolean check = true;
        if (arrTwo.length != arrOne.length) {
            check = false;
        }
        for (int i = 0; i < arrOne.length; i++) {
            if (arrTwo[i] != arrOne[i]) {
                check = false;
            }
        }
        return check;
    }

    /**
     * Main method to demonstrate array comparison.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arrOne[] = {1, 2, 3, 4};
        int arrTwo[] = {1, 2, 3, 4};
        System.out.println(checkTwoArray(arrOne, arrTwo));
    }

}
