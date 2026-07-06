package com.tecspeak.basics;

import java.util.Arrays;

public class PrintEvenNumberFromArray {
    public static void printEvenNumber(int arr[]) {
        int evenNumbers[] = {};
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int num = arr[i];
                System.out.println(arr[i]);

            }
        }
    }

    public static void main(String[] args) {
        int arr[]={34,67,12,65,39};
        printEvenNumber(arr);
    }
}


