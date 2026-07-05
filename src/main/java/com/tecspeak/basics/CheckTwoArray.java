package com.tecspeak.basics;

public class CheckTwoArray {
    public static boolean checkTwoArray(int arrOne[], int arrTwo[]) {
        boolean check = true;
        for (int i = 0; i < arrOne.length; i++) {
            if (arrTwo[i] != arrOne[i]) {
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int arrOne[] = {1, 2, 3, 4};
        int arrTwo[] = {1, 2, 3, 7};
        System.out.println(checkTwoArray(arrOne, arrTwo));
    }

}
