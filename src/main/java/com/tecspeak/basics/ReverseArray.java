package com.tecspeak.basics;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[]) {
        int reverse[] = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reverse[j] = arr[i];


        }
        System.out.println(Arrays.toString(reverse));
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 4, 3, 56, 7};
        reverseArray(arr);
    }
}
