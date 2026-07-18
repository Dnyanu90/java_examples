package com.tecspeak.basics;

/**
 * Generates and prints the A-B-N series.
 * <p>
 * The series is defined as: for each term i (0-indexed),
 * the value = a + b * (2^0 + 2^1 + ... + 2^i) = a + b * (2^(i+1) - 1).
 * The method validates that inputs fall within allowed ranges.
 * </p>
 *
 * @author TecSpeak
 */
public class ABNSeries {

    /**
     * Prints the first {@code n} terms of the A-B-N series.
     * <p>
     * Each term is computed as: a + sum of (2^j * b) for j = 0 to i.
     * Only prints if inputs are within valid ranges:
     * a in [0, 50], b in [0, 50], n in [1, 15].
     * </p>
     *
     * @param a the starting value of the series
     * @param b the multiplier used with powers of 2
     * @param n the number of terms to print
     */
    public static void printABNSeries(int a, int b, int n) {
        if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)) {
            for (int i = 0; i < n; i++) {
                int seriesNum = a;
                for (int j = 0; j <= i; j++) {
                    seriesNum += (Math.pow(2, j)) * b;
                }
                System.out.print(seriesNum + " ");
            }
        }
    }

    /**
     * Main method to demonstrate the A-B-N series.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
//        2
//        0 2 10
//        5 3 5
//        ABNSeries.printABNSeries(0, 2, 10);
        ABNSeries.printABNSeries(5, 3, 5);
    }
}
