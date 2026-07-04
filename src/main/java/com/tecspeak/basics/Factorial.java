package com.tecspeak.basics;

public class Factorial {

    public static int findFactorial(int n) {
        int fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;
    }

    public static int findFactorialWithRecursion(int n){
        if (n == 0 || n ==1){
            return 1;
        }
        return n * findFactorialWithRecursion(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Factorial.findFactorial(5));
        System.out.println(Factorial.findFactorialWithRecursion(5));
    }
}
