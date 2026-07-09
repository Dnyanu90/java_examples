package com.tecspeak.basics;

public class FindLCM {
    public static int GCD(int a,int b){
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int a,int b){
        return (a*b)/GCD(a,b);
    }

    public static void main(String[] args) {
        System.out.println(LCM(3,7));
    }

}
