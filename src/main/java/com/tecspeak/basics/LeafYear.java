package com.tecspeak.basics;

/**
 * Checks whether a given year is a leap year.
 * <p>
 * A leap year occurs every 4 years, except for years divisible by 100,
 * which must also be divisible by 400.
 * </p>
 *
 * @author TecSpeak
 */
public class LeafYear {

    /**
     * Determines if a year is a leap year and prints the result.
     * <p>
     * Implements standard leap year logic checking divisibility by 400, 100, and 4.
     * </p>
     *
     * @param n the year to check
     */
    // FIX: Corrected leap year logic to include all cases (4, 100, 400)
    static void leafYear(int n) {
        boolean check = false;
        if (n % 400 == 0) {
            check = true;
        } else if (n % 100 == 0) {
            check = false;
        } else if (n % 4 == 0) {
            check = true;
        }
        System.out.println(check);
    }

    /**
     * Determines if a year is a leap year using a recursive approach.
     *
     * @param year the year to check
     * @param step the current step in the recursive logic (0 to 2)
     * @return {@code true} if the year is a leap year
     */
    static boolean isLeap(int year, int step) {

        if (step == 0) {
            if (year % 400 == 0) return true;
            return isLeap(year, 1);
        }

        if (step == 1) {
            if (year % 100 == 0) return false;
            return isLeap(year, 2);
        }

        if (step == 2) {
            if (year % 4 == 0) return true;
            return false;
        }

        return false;
    }

    /**
     * Main method to demonstrate leap year checking.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
//        leafYear(2000);
        System.out.println(isLeap(1900, 0));
    }
}
