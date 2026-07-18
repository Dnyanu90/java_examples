package com.tecspeak.basics;

/**
 * Checks whether a given number is a Perfect Number.
 * <p>
 * A perfect number is a positive integer that equals the sum of its
 * proper divisors (all divisors excluding itself).
 * Example: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.
 * </p>
 *
 * @author TecSpeak
 */
public class CheckPerfect {

    /**
     * Determines if the given number is a perfect number.
     *
     * @param n the number to check
     * @return {@code true} if the number equals the sum of its proper divisors
     */
    public static boolean checkPerfectNumber(int n) {
        int sumOfDivisor = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumOfDivisor += i;
            }
        }
        return n == sumOfDivisor;
    }

    /**
     * Main method to demonstrate perfect number checking.
     *
     * @param args command-line arguments (not used)
     */
    // FIX: Added missing main method
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));    // true  (1+2+3=6)
        System.out.println(checkPerfectNumber(28));   // true  (1+2+4+7+14=28)
        System.out.println(checkPerfectNumber(12));   // false
    }
}
