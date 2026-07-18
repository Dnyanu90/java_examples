package com.tecspeak.basics;

/**
 * Checks whether a given integer contains only binary digits (0 and 1).
 * <p>
 * The number is treated as a decimal representation and each digit is
 * inspected to verify it is either 0 or 1.
 * </p>
 *
 * @author TecSpeak
 */
public class CheckBinary {

    /**
     * Determines if the given number consists only of digits 0 and 1.
     * <p>
     * Extracts each digit from right to left and checks if it is 0 or 1.
     * Returns {@code false} immediately if any other digit is found.
     * </p>
     *
     * @param num the number to check
     * @return {@code true} if all digits are 0 or 1, {@code false} otherwise
     */
    public static boolean checkBinary(int num) {
        // FIX: Removed unused variable 'check'
        if (num == 0) {
            return true;
        }
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            num = num / 10;
        }

        return true;
    }

    /**
     * Main method to demonstrate binary digit checking.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println(checkBinary(10110011));
    }
}
