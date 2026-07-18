package com.tecspeak.basics;

/**
 * Validates whether a given string input can be parsed as an integer.
 * <p>
 * Uses {@link Integer#parseInt(String)} with exception handling to determine
 * if the input string represents a valid integer value.
 * </p>
 *
 * @author TecSpeak
 */
public class CheckInputIntegerOrNot {

    /**
     * Checks if the given string can be parsed as a valid integer.
     *
     * @param input the string to check
     * @return {@code true} if the input is a valid integer, {@code false} otherwise
     */
    public static boolean checkInputIntegerOrNot(String input) {
        // FIX: Completed implementation — was just returning true
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Main method to demonstrate integer input validation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(checkInputIntegerOrNot("123"));    // true
        System.out.println(checkInputIntegerOrNot("12.3"));   // false
        System.out.println(checkInputIntegerOrNot("abc"));    // false
        System.out.println(checkInputIntegerOrNot("-45"));    // true
    }
}
