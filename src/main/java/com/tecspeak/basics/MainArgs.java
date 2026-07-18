package com.tecspeak.basics;

/**
 * Demonstrates the usage of command-line arguments in Java.
 *
 * @author TecSpeak
 */
public class MainArgs {

    /**
     * Main method that prints all command-line arguments passed to the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // FIX: Removed unused java.util.Arrays import
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
