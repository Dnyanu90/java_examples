package com.tecspeak.basics;
    public class FibonacciCheck {
        public static boolean isFibonacci(int num) {
            if (num == 0 || num == 1) return true;

            int a = 0, b = 1;
            int next = a + b;

            while (next <= num) {
                if (next == num) {
                    return true;
                }
                a = b;
                b = next;
                next = a + b;
            }
            return false;
        }

        public static void main(String[] args) {
            int num = 21;

            if (isFibonacci(num)) {
                System.out.println("Fibonacci number");
            } else {
                System.out.println("Not Fibonacci number");
            }
        }
    }

