package com.tecspeak.basics;

public class MissingNumber {
    public static void findMissing(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 1; i <= max; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing number: " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7};
        findMissing(arr);
    }
}