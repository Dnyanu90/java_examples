package com.tecspeak.basics.switchCase;

import java.util.Scanner;

/**
 * Maps a number to its corresponding day of the week.
 *
 * @author TecSpeak
 */
public class DayOfWeek {

    /**
     * Prints the name of the day corresponding to the given number (1-7).
     * <p>
     * 1 = Monday, 7 = Sunday.
     * </p>
     *
     * @param days the day number (1 to 7)
     */
    public static void printDays(int days) {
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday"); // FIX: Corrected typo "Tuesdaay" -> "Tuesday"
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    /**
     * Main method that prompts the user for a day number and prints the day.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        DayOfWeek.printDays(n);
        sc.close();
    }
}
