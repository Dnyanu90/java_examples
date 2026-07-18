package com.tecspeak.basics;

/**
 * Checks whether a given number belongs to the Fibonacci sequence.
 * <p>
 * Generates Fibonacci numbers iteratively until the target is reached or exceeded,
 * then checks for a match.
 * </p>
 *
 * @author TecSpeak
 */
public class FibonacciCheck {

    /**
     * Determines if the given number is a Fibonacci number.
     * <p>
     * Generates the Fibonacci sequence from 0, 1, 1, 2, 3, 5, ...
     * and checks if the target number appears in the sequence.
     * </p>
     *
     * @param num the number to check
     * @return {@code true} if the number is in the Fibonacci sequence
     */
    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) return true;

        int a = 0, b = 1;
        int next = a + b;

        while (next <= num) {
            if (next == num) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }
        return false;
    }

    /**
     * Main method to demonstrate Fibonacci membership check.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int num = 21;

        if (isFibonacci(num)) {
            System.out.println("Fibonacci number");
        } else {
            System.out.println("Not Fibonacci number");
        }
    }
}
