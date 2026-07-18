package com.tecspeak.basics;

/**
 * Calculates the Least Common Multiple (LCM) of three numbers.
 * <p>
 * Extends the basic LCM logic by applying it cumulatively:
 * LCM(a, b, c) = LCM(LCM(a, b), c).
 * </p>
 *
 * @author TecSpeak
 */
public class LCMOfThreeNumbers {

    /**
     * Computes the GCD of two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor
     */
    public static int GCD(int a, int b) {
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
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    /**
     * Computes the LCM of three integers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the least common multiple of a, b, and c
     */
    public static int threeNumberOfLCM(int a, int b, int c) {
        return LCM(LCM(a, b), c);
    }

    /**
     * Main method to demonstrate LCM calculation for three numbers.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(threeNumberOfLCM(56, 75, 34));
    }
}
