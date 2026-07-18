package com.tecspeak.basics;

/**
 * Checks if a given number is a palindrome.
 * <p>
 * A palindrome number reads the same forwards and backwards.
 * For example, 121, 1331, 1243421 are palindromes.
 * </p>
 *
 * @author TecSpeak
 */
public class Palindrome {

    /**
     * Reverses the given number and checks if it matches the original number.
     * <p>
     * Prints "Yes" if the number is a palindrome, otherwise prints "No".
     * </p>
     *
     * @param num the number to check
     */
    static void checkPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Main method to demonstrate palindrome checking.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        checkPalindrome(1243421);
    }
}