package com.tecspeak.basics;

public class SecondLargestNumber {
    public static void secondLargestNumber(int arr[]) {

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 7, 8};
        secondLargestNumber(arr);
    }
}