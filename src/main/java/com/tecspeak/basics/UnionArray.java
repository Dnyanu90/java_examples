package com.tecspeak.basics;

public class UnionArray {
    public static void unionArray(int arrOne[], int arrTwo[]) {

        int lengthOne = arrOne.length;
        int lengthTwo = arrTwo.length;

        int union[] = new int[lengthOne + lengthTwo];
        int k = 0;
        for (int i = 0; i < lengthOne; i++) {
            union[k] = arrOne[i];
            k++;
        }

        for (int i = 0; i < lengthTwo; i++) {

            boolean found = false;

            for (int j = 0; j < lengthOne; j++) {
                if (arrTwo[i] == arrOne[j]) {
                    found = true;
                    break;
                }
            }

            // if not found → add
            if (!found) {
                union[k] = arrTwo[i];
                k++;
            }
        }

        // print result
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arrOne[] = {1, 2};
        int arrTwo[] = {2, 3};

        unionArray(arrOne, arrTwo);
    }
}