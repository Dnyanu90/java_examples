package com.tecspeak.basics;

/**
 * Calculates the Least Common Multiple (LCM) of two numbers.
 * <p>
 * Demonstrates another implementation of LCM computation using GCD.
 * </p>
 *
 * @author TecSpeak
 */
public class LCM {

    /**
     * Computes the GCD of two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor
     */
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Computes the LCM of two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the least common multiple
     */
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Main method to demonstrate LCM calculation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int result = lcm(5, 7);
        System.out.println("LCM " + result);
    }
}
