package com.tecspeak.math;

/**
 * A utility class for generating cubes of numbers and identifying Armstrong numbers.
 *
 * @author TecSpeak
 */
public class CubeFactory {

    /**
     * Generates an array containing the cubes of numbers from 0 to 9.
     *
     * @return an integer array where index i contains i^3
     */
    public int[] getDigitCubes() {
        int[] cubes = new int[10];

        for (int i = 0; i <= 9; i++) {
            cubes[i] = i * i * i;
        }

        return cubes;
    }

    /**
     * Generates an array containing the cubes of digits from 0 to 9.
     * (Duplicate logic of {@link #getDigitCubes()})
     *
     * @return an integer array where index i contains i^3
     */
    public int[] getDigitCubes2() {
        int[] cubes = new int[10];
        int i = 0;
        while (i <= 9) {
            cubes[i] = i * i * i;
            i++;
        }

        return cubes;
    }

    /**
     * Main method to demonstrate array cube lookup for Armstrong number checks.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        CubeFactory factory = new CubeFactory();
        int[] result = factory.getDigitCubes2();

        int num = 153;
        int original = num;

        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = result[digit];
            sum = sum + cubeOfDigit;
            num = num / 10;
        }

        if (original == sum) {
            System.out.println("It's an Armstrong number.");
        } else {
            System.out.println("It's not an Armstrong number.");
        }
    }
}
