package com.tecspeak.basics;

/**
 * Checks whether a given number is an Armstrong (Narcissistic) number.
 * <p>
 * An Armstrong number of n digits is a number where the sum of each digit
 * raised to the power of n equals the number itself.
 * Example: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
 * </p>
 *
 * @author TecSpeak
 */
public class Armstrong {

    /**
     * Checks if a number is an Armstrong number for any number of digits.
     * <p>
     * Counts the number of digits first, then computes the sum of each digit
     * raised to the power of the total digit count.
     * </p>
     *
     * @param num the number to check
     * @return {@code true} if the number is an Armstrong number, {@code false} otherwise
     */
    static boolean checkArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        // Calculate sum of each digit raised to the power of digit count
        while (temp > 0) {

            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;

            temp = temp / 10;
        }

        return sum == original;
    }

    /**
     * Recursively computes the sum of cubes of each digit (3-digit Armstrong check only).
     *
     * @param n the number whose digit cubes are to be summed
     * @return the sum of cubes of all digits in the number
     */
    static int arm(int n) {
        if (n == 0)
            return 0;

        int d = n % 10;
        return d * d * d + arm(n / 10);
    }

    /**
     * Checks if a number is an Armstrong number using cube of digits (3-digit numbers only).
     * <p>
     * This method only works correctly for 3-digit Armstrong numbers
     * since it always uses the cube (power of 3) of each digit.
     * </p>
     *
     * @param n the number to check
     * @return {@code true} if the number is a 3-digit Armstrong number, {@code false} otherwise
     */
    public static boolean checkForArmstrongNumber(int n) {
        int original = n;
        int sumOfDigitsCube = 0;

        while (n != 0) {
            int digit = n % 10;
            sumOfDigitsCube += (digit * digit * digit);
            n = n / 10;
        }
        return original == sumOfDigitsCube;
    }

    /**
     * Main method to demonstrate Armstrong number checking.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
//        System.out.println(checkArmstrong(153));
        System.out.println(checkForArmstrongNumber(417));
//        arm(5);
    }
}