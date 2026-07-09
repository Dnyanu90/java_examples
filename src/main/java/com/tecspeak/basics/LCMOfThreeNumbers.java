package com.tecspeak.basics;

public class LCMOfThreeNumbers {
    public static int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
    public static int LCM(int a, int b){
        return (a*b)/GCD(a,b);
    }
    public static int threeNumberOfLCM(int a, int b, int c) {
        return LCM(LCM(a, b), c);

    }

    public static void main(String[] args) {
        System.out.println(threeNumberOfLCM(56,75,34));
    }
}
