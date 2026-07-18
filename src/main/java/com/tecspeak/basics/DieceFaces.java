package com.tecspeak.basics;

import java.util.Scanner;

/**
 * Determines the opposite face of a dice given the top face value.
 * <p>
 * On a standard dice, opposite faces always sum to 7:
 * 1↔6, 2↔5, 3↔4.
 * </p>
 *
 * @author TecSpeak
 */
public class DieceFaces {

    /**
     * Returns the bottom face of a dice given the top face.
     * Uses the formula: bottom = 7 - top.
     *
     * @param upSide the value on the top face (must be 1-6)
     * @return the value on the bottom face, or -1 if input is invalid
     */
    public static int printDiceFaces(int upSide) {
        if (upSide > 0 && upSide <= 6) {
            return 7 - upSide;
        }
        return -1;
    }

    /**
     * Returns the bottom face of a dice using if-else chain.
     * <p>
     * An alternative implementation that explicitly maps each face
     * to its opposite.
     * </p>
     *
     * @param upSide the value on the top face (must be 1-6)
     * @return the value on the bottom face, or -1 if input is invalid
     */
    // FIX: Changed condition from (upSide<1 || upSide>7) to (upSide>=1 && upSide<=6)
    public static int diceFacePrint(int upSide) {
        int downSide = -1;
        if (upSide >= 1 && upSide <= 6) {
            if (upSide == 1) {
                downSide = 6;

            } else if (upSide == 2) {
                downSide = 5;

            } else if (upSide == 3) {
                downSide = 4;
            } else if (upSide == 4) {
                downSide = 3;
            } else if (upSide == 5) {
                downSide = 2;
            } else if (upSide == 6) {
                downSide = 1;

            }
        }

        return downSide;
    }

    /**
     * Main method to demonstrate dice face calculation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
//        System.out.println(diceFacePrint(7));
        System.out.println(printDiceFaces(-5));
    }
}
