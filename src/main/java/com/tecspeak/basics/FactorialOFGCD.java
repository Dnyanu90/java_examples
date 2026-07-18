package com.tecspeak.basics;

/**
 * Computes the factorial of the GCD (Greatest Common Divisor) of two numbers.
 * <p>
 * First finds the GCD using the Euclidean algorithm, then computes
 * the factorial of that GCD value.
 * </p>
 *
 * @author TecSpeak
 */
public class FactorialOFGCD {

    /**
     * Computes the GCD of two numbers using the Euclidean algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor of a and b
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
     * Computes the factorial of a given number.
     *
     * @param a the non-negative integer whose factorial is to be computed
     * @return the factorial of a
     */
    public static int Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * Main method demonstrating GCD computation followed by factorial.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int a = 8;
        int b = 16;
        System.out.println("GCD :" + GCD(a, b));
        int valueOfGCD = GCD(a, b);

        System.out.println("Factorial of GCD :" + Factorial(valueOfGCD));
    }
}
