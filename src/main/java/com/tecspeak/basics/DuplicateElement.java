package com.tecspeak.basics;

public class DuplicateElement {

    public static void duplicateElementInArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 3, 3, 3, 3, 3, 3, 3, 3};
        duplicateElementInArray(arr);
    }
}