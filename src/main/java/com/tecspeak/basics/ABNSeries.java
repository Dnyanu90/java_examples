package com.tecspeak.basics;

public class ABNSeries {

    public static void printABNSeries (int a, int b, int n){
        if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)){
            for (int i = 0; i < n; i++) {
                int seriesNum = a;
                for (int j = 0; j <= i; j++) {
                    seriesNum += (Math.pow(2, j))*b;
                }
                System.out.print(seriesNum+" ");
            }
        }
    }

    public static void main(String[] args) {
//        2
//        0 2 10
//        5 3 5
//        ABNSeries.printABNSeries(0, 2, 10);
        ABNSeries.printABNSeries(5, 3, 5);
    }
}
