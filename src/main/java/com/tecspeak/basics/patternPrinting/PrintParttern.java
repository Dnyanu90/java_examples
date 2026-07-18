package com.tecspeak.basics.patternPrinting;

/**
 * Demonstrates various pattern printing techniques in Java.
 * <p>
 * Contains methods to print squares, right triangles, inverted right triangles,
 * pyramids, hollow rectangles, number triangles, and letter shapes (X, H).
 * </p>
 *
 * @author TecSpeak
 */
public class PrintParttern {

    /**
     * Prints a solid square of size n * n using asterisks.
     *
     * @param n the size of the square
     */
    static void Square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a right-aligned triangle of size n.
     *
     * @param n the size of the triangle
     */
    static void RightTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints an inverted right triangle of size n.
     *
     * @param n the size of the triangle
     */
    static void InvertedRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a centered pyramid of height n.
     *
     * @param n the height of the pyramid
     */
    static void Pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a hollow rectangle of size n * n.
     *
     * @param n the size of the rectangle
     */
    static void HolllowRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Prints a left-aligned triangle using numbers.
     *
     * @param n the height of the triangle
     */
    static void NumTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * Prints the letter 'X' using asterisks.
     *
     * @param n the size of the letter X
     */
    static void XPrinting(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (j == i || j == n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Prints the letter 'H' using asterisks.
     *
     * @param n the size of the letter H
     */
    static void HPrinting(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    /**
     * Main method to demonstrate various pattern printing techniques.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int n;
//        Square(4);
//        RightTriangle(4);
//        InvertedRightTriangle(4);
//        Pyramid(7);
//        HolllowRectangle(4);
//         NumTriangle(5);
//        XPrinting(6);
        HPrinting(6);
    }
}
