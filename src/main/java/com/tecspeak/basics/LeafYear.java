package com.tecspeak.basics;

public class LeafYear {
    static void leafYear(int n) {
        if (n % 100 == 0 && n % 400 == 0) {
            boolean check = true;
            System.out.println(check);
        } else {
            boolean check = false;
            System.out.println(check);
        }
    }
    static boolean isLeap(int year, int step) {

        if (step == 0) {
            if (year % 400 == 0) return true;
            return isLeap(year, 1);
        }

        if (step == 1) {
            if (year % 100 == 0) return false;
            return isLeap(year, 2);
        }

        if (step == 2) {
            if (year % 4 == 0) return true;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
//        leafYear(2000);
        System.out.println(isLeap(1900,0));
    }
}
