package com.tecspeak.basics;

import java.util.Arrays;

/**
 * Demonstrates swapping two numbers using a temporary variable
 * and without using a temporary variable.
 *
 * @author TecSpeak
 */
public class SwapNumber {

    /**
     * Swaps two numbers using a temporary variable.
     *
     * @param a the first number
     * @param b the second number
     * @return an array containing the swapped numbers [b, a]
     */
    public static int[] swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        int[] swapped = {a, b};
        return swapped;
    }

    /**
     * Swaps two numbers without using a temporary variable, utilizing arithmetic operations.
     *
     * @param a the first number
     * @param b the second number
     * @return an array containing the swapped numbers [b, a]
     */
    public static int[] swapNumbersWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        int[] result = {a, b};
        return result;
    }

    /**
     * Main method to demonstrate number swapping.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SwapNumber.swapNumbers(5, 6)));
        System.out.println(Arrays.toString(SwapNumber.swapNumbers(700, 57)));
    }
}
