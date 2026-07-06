package com.tecspeak.basics;

public class CheckPerfect {
    public static boolean checkPerfectNumber(int n) {
        int sumOfDivisor = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumOfDivisor += i;
            }
        }
        return n == sumOfDivisor;
    }
}
