package com.tecspeak.basics;

public class SumOfDigit {

    public static int sum0fDigit(int n){
        int sum = 0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println(sum0fDigit(124));
    }

}
