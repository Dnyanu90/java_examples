package com.tecspeak.basics;

/**
 * Calculates the Least Common Multiple (LCM) of two numbers.
 * <p>
 * The LCM is computed using the relationship:
 * LCM(a, b) = (a * b) / GCD(a, b).
 * </p>
 *
 * @author TecSpeak
 */
public class FindLCM {

    /**
     * Computes the GCD of two integers using the Euclidean algorithm.
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
     * Main method to demonstrate LCM calculation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(LCM(3, 7));
    }
}
