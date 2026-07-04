package com.tecspeak.basics;

import java.util.Arrays;

public class Fibonacci {
    public static int[] fibonacciSeries(int n) {
        int arr[] = new int[n];
        if (n >= 1) arr[0] = 0;
        if (n >= 2) arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static int[] fibinacciSerisArr(int n) {
        int arr[] = new int[n];
        for (int i=1;i<n;i++){
            if (i==0){
                arr[0]=0;
            }else if (i==1){
                arr[1]=1;
            }else
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(Fibonacci.fibonacciSeries(1)));
        System.out.println(Arrays.toString(Fibonacci.fibinacciSerisArr(5)));
    }

}
