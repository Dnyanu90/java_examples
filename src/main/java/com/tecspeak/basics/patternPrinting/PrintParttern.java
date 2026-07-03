package com.tecspeak.basics.patternPrinting;

public class PrintParttern {
    static void Square(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void RightTriangle(int n){
        for (int i=n;i>0;i--){
            for (int j=i-1;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void InvertedRightTriangle(int n){
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static void Pyramid(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
                for (int k=0;k<2*i+1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

    }

    static  void HolllowRectangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void NumTriangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
//        Square(4);
//        RightTriangle(4);
//        InvertedRightTriangle(4);
//        Pyramid(7);
//        HolllowRectangle(4);
        NumTriangle(5);
    }
}
