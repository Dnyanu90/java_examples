package com.tecspeak.basics;

public class PrimeNumber {

    static void primeNumber(int n) {

        for (int i = 2; i < n; i++) {
            int j = 2;
            boolean isPrime = true;
            while (j * j <= i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        primeNumber(100);
    }
}