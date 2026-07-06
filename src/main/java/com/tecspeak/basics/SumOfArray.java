package com.tecspeak.basics;

public class SumOfArray {

    public static int sumOfArray(int arr[]){
        int sum=arr[0];
        for (int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
       return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1,2,3,4}));
    }
}
