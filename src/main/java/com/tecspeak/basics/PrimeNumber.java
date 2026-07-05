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

    static boolean isprime(int n,int i) {
        if (n>=2){
            return (n==2);
        }
        if (n%i==0){
            return false;
        }
        if (i*i>n){
            return true;
        }
        return isprime(n,i+1);
    }

    public static void main(String[] args) {
        primeNumber(100);
        isprime(10,5);
    }
}