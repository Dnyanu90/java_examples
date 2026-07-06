package com.tecspeak.basics;

public class SepareteZero {
    public static void separateZero(int arr[]) {

        int result[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3};

        separateZero(arr);
    }
}
