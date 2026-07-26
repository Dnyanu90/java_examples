package com.tecspeak.basics;

public class PairOfCube {
    public static int pairOfCubeCount(int n){
        int count=0;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                if (i*i*i+j*j*j==n){
                    count ++;
                }
            }
        }
        return count;
    }
    public static int pairOFCuteInIAndJ(int n){
        int count = 0;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                if (i*i*i+j*j*j==n){
                    System.out.println("Match found! i = " + i  + ", j = " + j  +" = "+ n);
                    count ++;
                }
            }
        }

        return  count;
    }



    public static void main(String[] args) {
        System.out.println(pairOfCubeCount(9));
        System.out.println(pairOFCuteInIAndJ(28));
    }
}
