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

    public static void main(String[] args) {
        leafYear(2000);
    }
}
