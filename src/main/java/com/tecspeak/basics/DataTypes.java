package com.tecspeak.basics;

/**
 * Demonstrates Java primitive data types and type casting.
 * <p>
 * Shows explicit (narrowing) and implicit (widening) type conversions
 * between byte, short, char, int, long, float, and double types.
 * </p>
 *
 * @author TecSpeak
 */
public class DataTypes {

    /**
     * Main method demonstrating type casting between primitive data types.
     * <ul>
     *   <li>Explicit (narrowing) cast: short → byte</li>
     *   <li>Implicit (widening) cast: int → float</li>
     * </ul>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
         byte byt;
         short sh = 23;
         char ch = 'A';
         int num = 234;
         long lg = 53431;
         float fl = 34.5f;
         double d = 3454.63454433;

      // byt=sh --> cast Expression
        byt = (byte) sh;
        System.out.println(byt);

        // sh=ch --> cast Expression
        // sh=(char)ch --> cast Expression
        // ch=(int)num--> cast Expression
        System.out.println("Before:" + fl);
        fl = num;
        System.out.println("After:" + fl);

    }
}
