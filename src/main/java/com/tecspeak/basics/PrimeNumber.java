package com.tecspeak.basics;

/**
 * Demonstrates finding prime numbers using loops and recursion.
 * <p>
 * A prime number is a positive integer greater than 1 that has no positive divisors
 * other than 1 and itself.
 * </p>
 *
 * @author TecSpeak
 */
public class PrimeNumber {

    /**
     * Prints all prime numbers up to a given limit.
     * <p>
     * Iterates from 2 to n-1 and checks each number for primality
     * by attempting division up to its square root.
     * </p>
     *
     * @param n the upper limit (exclusive)
     */
    static void primeNumber(int n) {

        for (int i = 2; i < n; i++) {
            int j = 2;
            boolean isPrime = true;
            while (j * j <= i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    /**
     * Recursively checks if a given number is prime.
     * <p>
     * To start the check, pass {@code i = 2}.
     * </p>
     *
     * @param n the number to check
     * @param i the current divisor to test (initially 2)
     * @return {@code true} if n is prime, {@code false} otherwise
     */
    // FIX: Changed condition from n>=2 to n<=2 for proper base case handling
    static boolean isprime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isprime(n, i + 1);
    }

    /**
     * Main method to demonstrate prime number generation and checking.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        primeNumber(100);
        System.out.println(isprime(10, 2)); // Fixed starting divisor from 5 to 2
    }
}