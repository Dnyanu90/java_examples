package com.tecspeak.math;

/**
 * A utility class for calculating half of a given number.
 *
 * @author TecSpeak
 */
public class Halfer {

    /**
     * Calculates and returns half of the given number.
     *
     * @param num the number to halve
     * @return half of the input number
     */
    // FIX: Changed return from `num * num` (square) to `num / 2` (half)
    public int getHalf(int num) {
        return num / 2;
    }
}
