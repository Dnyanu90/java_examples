package com.tecspeak.basics;

/**
 * Reverses the digits of an integer.
 * <p>
 * Demonstrates basic mathematical digit manipulation using modulo (%) and division (/).
 * </p>
 *
 * @author TecSpeak
 */
public class ReverseNumber {

    /**
     * Reverses the digits of the given number.
     *
     * @param n the number to reverse
     * @return the reversed number
     */
    public static int reveseNumber(int n) {
        int revese = 0;
        while (n != 0) {
            int digit = n % 10;
            revese = revese * 10 + digit;
            n = n / 10;
        }
        return revese;
    }

    /**
     * Main method to demonstrate number reversal.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(reveseNumber(12345)); // 54321
        System.out.println(reveseNumber(-987));  // -789
    }
}
