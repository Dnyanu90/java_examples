package com.tecspeak.basics;

import java.util.ArrayList;

/**
 * Demonstrates the usage of generic collections with primitive wrapper classes.
 * <p>
 * Java collections (like ArrayList) cannot store primitive types directly.
 * Instead, wrapper classes (e.g., Integer for int) must be used.
 * </p>
 *
 * @author TecSpeak
 */
public class PrimitiveVariables {

    /**
     * Main method showing ArrayList usage with String and Integer.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        ArrayList<String> strs = new ArrayList<>();
        strs.add("A");
        strs.add("B");
        strs.add("C");
        strs.add("D");
        strs.add("E");

        System.out.println(strs);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        System.out.println(ints);
    }
}
