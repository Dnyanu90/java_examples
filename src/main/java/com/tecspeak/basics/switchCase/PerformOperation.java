package com.tecspeak.basics.switchCase;

/**
 * Performs basic arithmetic operations using a switch statement.
 *
 * @author TecSpeak
 */
public class PerformOperation {

    /**
     * Evaluates a mathematical operation based on the given operator character.
     * <p>
     * Supports addition (+), subtraction (-), multiplication (*), and division (/).
     * </p>
     *
     * @param a   the first operand
     * @param b   the second operand
     * @param ops the arithmetic operator character (+, -, *, /)
     */
    public static void performMathsOperation(int a, int b, char ops) {
        switch (ops) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                // Handle division by zero to prevent exception
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Invalid");


        }
    }

    /**
     * Main method to demonstrate arithmetic operations.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        PerformOperation.performMathsOperation(2, 4, '+');
    }
}
