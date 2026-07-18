package com.tecspeak.basics;

/**
 * Finds the GCD (Greatest Common Divisor) of two numbers using the Euclidean algorithm.
 * <p>
 * The Euclidean algorithm repeatedly replaces the larger number with the remainder
 * of dividing the two numbers until the remainder is zero.
 * </p>
 *
 * @author TecSpeak
 */
public class FindGCD {

    /**
     * Computes the GCD of two integers using the Euclidean algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor of a and b
     */
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Main method to demonstrate GCD calculation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("GCD :" + findGCD(10, 15));
    }
}
