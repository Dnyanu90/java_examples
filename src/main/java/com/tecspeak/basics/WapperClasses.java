package com.tecspeak.basics;

/**
 * Demonstrates the use of Java wrapper classes and autoboxing/unboxing.
 * <p>
 * Wrapper classes (Byte, Integer, etc.) provide a way to use primitive data types
 * as objects. Java handles the conversion automatically via autoboxing and unboxing.
 * </p>
 *
 * @author TecSpeak
 */
public class WapperClasses {

    /**
     * Main method demonstrating wrapper class instantiation and usage.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        byte bt = 1;
        Byte objbt = bt; // Autoboxing
        System.out.println(bt);
        System.out.println(objbt);

        int num = 10;
        Integer objnum = num; // Autoboxing
        System.out.println(num);
        System.out.println(objnum);

        int num1 = objnum; // Unboxing
        System.out.println(num1);
    }
}
