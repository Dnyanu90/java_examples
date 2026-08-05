package com.tecspeak.basics;

/**
 * Calculates the sum of the digits of a number.
 *
 * @author TecSpeak
 */
public class SumOfDigit {

    /**
     * Computes the sum of individual digits of the given number.
     *
     * @param n the number to process
     * @return the sum of its digits
     */
    public static int sum0fDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sum0fDigits(int n) {
        int sum = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i);
        }
        return sum;
    }


    /**
     * Main method to demonstrate summing digits.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println(sum0fDigit(124));
        System.out.println(sum0fDigits(124));
    }

}
