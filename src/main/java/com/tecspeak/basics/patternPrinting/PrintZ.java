package com.tecspeak.basics.patternPrinting;

import java.util.Scanner;

public class PrintZ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if (i==0 || i+j==n-1 || i==n-1){
                  System.out.print("*");
              }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
