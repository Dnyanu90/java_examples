package com.tecspeak.basics.switchCase;

/**
 * Checks the type of a given character (e.g., alphabet, digit, special character).
 *
 * @author TecSpeak
 */
public class CharacterTypeCheck {

    /**
     * Identifies and prints the type of the given character using a switch statement.
     * <p>
     * Categorizes characters into Vowel, Consonant, Digit, or Special Character.
     * </p>
     *
     * @param ch the character to check
     */
    public static void checkCharacterType(char ch) {
        int category;

        // Categorize the character
        if (Character.isLetter(ch)) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                category = 1; // Vowel
            } else {
                category = 2; // Consonant
            }
        } else if (Character.isDigit(ch)) {
            category = 3; // Digit
        } else {
            category = 4; // Special Character
        }

        switch (category) {
            case 1:
                System.out.println("Vowel");
                break;
            case 2:
                System.out.println("Consonant");
                break;
            case 3:
                System.out.println("Digit");
                break;
            case 4:
                System.out.println("Special Character");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    /**
     * Main method to demonstrate character type checking.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        checkCharacterType('A');
        checkCharacterType('z');
        checkCharacterType('5');
        checkCharacterType('$');
    }
}
