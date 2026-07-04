package com.tecspeak.basics;

public class Palindrome {
    static void checkPalindrome(int num){
        int original = num;
        int reverse = 0;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        checkPalindrome(1243421);
    }
}