package com.tecspeak.basics.switchCase;

public class PerformOperation {
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
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid");


        }
    }

    public static void main(String[] args) {
        PerformOperation.performMathsOperation(2,4,'+');
    }
}
