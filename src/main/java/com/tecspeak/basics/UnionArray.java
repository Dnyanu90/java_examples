package com.tecspeak.basics;

/**
 * Computes and prints the union of two integer arrays.
 * <p>
 * The union of two arrays includes all elements from both arrays,
 * without displaying duplicates that appear across both arrays.
 * </p>
 *
 * @author TecSpeak
 */
public class UnionArray {

    /**
     * Finds and prints the union of two given arrays.
     * <p>
     * Copies all elements from the first array to the result array,
     * then iterates through the second array and appends only those
     * elements that were not already added.
     * </p>
     *
     * @param arrOne the first array
     * @param arrTwo the second array
     */
    public static void unionArray(int arrOne[], int arrTwo[]) {

        int lengthOne = arrOne.length;
        int lengthTwo = arrTwo.length;

        int union[] = new int[lengthOne + lengthTwo];
        int k = 0;
        for (int i = 0; i < lengthOne; i++) {
            union[k] = arrOne[i];
            k++;
        }

        for (int i = 0; i < lengthTwo; i++) {

            boolean found = false;

            for (int j = 0; j < lengthOne; j++) {
                if (arrTwo[i] == arrOne[j]) {
                    found = true;
                    break;
                }
            }

            // if not found → add
            if (!found) {
                union[k] = arrTwo[i];
                k++;
            }
        }

        // print result
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();
    }

    /**
     * Main method to demonstrate finding the union of two arrays.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int arrOne[] = {1, 2};
        int arrTwo[] = {2, 3};

        unionArray(arrOne, arrTwo);
    }
}