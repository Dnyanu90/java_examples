package com.tecspeak.math;

/**
 * A simple calculator class demonstrating stateful operations.
 * <p>
 * Maintains an internal total that can be modified via addition and multiplication.
 * </p>
 *
 * @author TecSpeak
 */
public class Calculator {

    /** The internal running total of the calculator. */
    public int total;

    /**
     * Constructs a Calculator with a specified initial value.
     *
     * @param startingValue the initial value for the total
     */
    public Calculator(int startingValue) {
        total = startingValue;
    }

    /**
     * Adds a value to the current total.
     *
     * @param value the amount to add
     */
    public void add(int value) {
        total += value;
    }

    /**
     * Multiplies the current total by a value.
     *
     * @param value the multiplier
     */
    public void multiply(int value) {
        total *= value;
    }
}
