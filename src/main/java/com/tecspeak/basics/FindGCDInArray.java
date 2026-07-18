package com.tecspeak.basics;

public class FindGCDInArray {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

     public static void main(String[] args) {
        int[] arr = {4,8,6};

        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            ans = gcd(ans, arr[i]);
        }

        System.out.println(ans);
    }

}
