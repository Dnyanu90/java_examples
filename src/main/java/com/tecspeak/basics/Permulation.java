package com.tecspeak.basics;

public class Permulation {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int countPermulation(int a, int b) {
        int permulation = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = i + 1; j <= a; j++) {
                System.out.println(i + " " + j);
                System.out.println(j + " " + i);

                permulation += 2;
            }
        }
        return permulation;
    }

    public static int combination(int n, int r) {
        int ncr = factorial(n) / factorial(r) * (factorial(n - r));
        return ncr;
    }

    public static void main(String[] args) {
        System.out.println(countPermulation(5, 2));
        System.out.println(combination(23, 56));
    }
}
