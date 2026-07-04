package com.tecspeak.basics;

import java.util.Arrays;

public class FlatteningArray {
    public static int[] flatteningArray() {
        int sizeOfArray = 0;
        int twoD[][] = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                sizeOfArray++;
//                System.out.print(twoD[i][j]);
            }
        }

        int arr1[] = new int[sizeOfArray];
        int k = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD.length; j++) {
                arr1[k] = twoD[i][j];
                k++;
            }
        }

        return arr1;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(FlatteningArray.flatteningArray()));
    }
}
