package com.tecspeak.basics;

public class FindGCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println("GCD :" + findGCD(7, 3));
    }
}
