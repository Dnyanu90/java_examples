package com.tecspeak.basics;

public class Armstrong {
    static boolean checkArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;


        while (temp > 0) {

            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;

            temp = temp / 10;
        }

        return sum == original;
    }

    static int arm(int n) {
        if (n == 0)
            return 0;

        int d = n % 10;
        return d*d*d + arm(n / 10);
    }

    public static boolean checkForArmstrongNumber(int n){
        int original = n;
        int sumOfDigitsCube = 0;

        while(n!=0){
            int digit=n%10;
            sumOfDigitsCube += (digit*digit*digit);
            n=n/10;
        }
        return original == sumOfDigitsCube;
    }

    public static void main(String[] args) {
//        System.out.println(checkArmstrong(153));
        System.out.println(checkForArmstrongNumber(417));
//        arm(5);
    }
}