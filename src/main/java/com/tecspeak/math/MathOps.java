package com.tecspeak.math;

/**
 * Demonstrates the usage of standard Java Math utility operations and basic arithmetic.
 *
 * @author TecSpeak
 */
public class MathOps {

    /**
     * Adds two integers.
     * @param a first operand
     * @param b second operand
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     * @param a first operand
     * @param b second operand
     * @return difference of a and b
     */
    public static int sub(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a first operand
     * @param b second operand
     * @return product of a and b
     */
    public static int mul(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * @param a numerator
     * @param b denominator
     * @return quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public static int div(int a, int b) {
        return a / b;
    }

    /**
     * Computes the remainder of dividing the first integer by the second.
     * @param a numerator
     * @param b denominator
     * @return remainder of a divided by b
     */
    public static int mod(int a, int b) {
        return a % b;
    }

    /**
     * Main method demonstrating Math.max() and Math.pow().
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(Math.max(12, 18));
        System.out.println(Math.pow(2, 3));
    }
}
