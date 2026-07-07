package com.tecspeak.basics;

public class CountOddNumbers {
    public static int countOddNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOddNumbers(new int[]{8,3,6,2,5,7}));
    }
}
