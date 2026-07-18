package com.tecspeak.basics;

/**
 * Calculates the factorial of a number using iterative and recursive approaches.
 * <p>
 * Factorial of n (n!) = 1 × 2 × 3 × ... × n.
 * For example, 5! = 120.
 * </p>
 *
 * @author TecSpeak
 */
public class Factorial {

    /**
     * Calculates factorial using an iterative (while loop) approach.
     *
     * @param n the non-negative integer whose factorial is to be computed
     * @return the factorial of n
     */
    public static int findFactorial(int n) {
        int fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;
    }

    /**
     * Calculates factorial using a recursive approach.
     * <p>
     * Base case: 0! = 1! = 1.
     * Recursive case: n! = n × (n-1)!
     * </p>
     *
     * @param n the non-negative integer whose factorial is to be computed
     * @return the factorial of n
     */
    public static int findFactorialWithRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorialWithRecursion(n - 1);
    }

    /**
     * Main method to demonstrate both factorial methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(Factorial.findFactorial(5));
        System.out.println(Factorial.findFactorialWithRecursion(5));
    }
}
