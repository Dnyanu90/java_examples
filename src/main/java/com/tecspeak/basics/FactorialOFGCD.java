package com.tecspeak.basics;

public class FactorialOFGCD {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int a=8;
        int b=16;
        System.out.println(GCD(a,b));
        int valueOfGCD=GCD(a,b);

        System.out.println(Factorial(valueOfGCD));
    }
}
