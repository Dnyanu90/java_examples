package com.tecspeak.basics.switchCase;

import java.util.Scanner;

/**
 * Checks if a given alphabetical character is a vowel or a consonant.
 * <p>
 * Uses a switch statement with fall-through logic for vowels.
 * </p>
 *
 * @author TecSpeak
 */
public class CheckOvelOrConsonant {

    /**
     * Determines whether the character is a vowel or a consonant and prints the result.
     *
     * @param ch the character to check
     */
    // FIX: Added missing break statement after printing "Vowel" (was falling through)
    public static void printOVelOrConsonant(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break; // Added break to prevent falling through to Consonant
            default:
                System.out.println("Consonant");
        }


    }

    /**
     * Main method that prompts the user for a character and checks its type.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        CheckOvelOrConsonant.printOVelOrConsonant(ch);
        sc.close();
    }
}
