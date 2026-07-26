package com.tecspeak.basics;

public class Permulation {
    public static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int countPermulation(int a,int b){
        int permulation=0;
        for (int i=0;i<=a;i++){
            for (int j=0;j<a;j++){

                permulation=factorial(a)/factorial(a-b);
                System.out.println(permulation);
            }
        }
        return permulation;
    }
public static void main(String[] args) {
    System.out.println(countPermulation(5,2));
}
}
