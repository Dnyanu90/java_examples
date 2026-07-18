package com.tecspeak.basics.patternPrinting;

/**
 * Prints the letter 'A' using asterisks.
 *
 * @author TecSpeak
 */
public class PrintA {

    /**
     * Main method to demonstrate pattern printing of the letter A.
     * <p>
     * Uses nested loops and conditional statements to format asterisks
     * into the shape of a capital 'A'.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int n = 5;
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j == mid) ||
                        (j - i == mid) ||
                        (i == mid) ||
                        (i > mid && (j == 0 || j == n - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
