package com.tecspeak.basics;

public class WapperClasses {
    public static void main(String[] args) {
        byte bt = 1;
        Byte objbt = bt;
        System.out.println(bt);
        System.out.println(objbt);

        int num=10;
        Integer objnum=num;
        System.out.println(num);
        System.out.println(objnum);

        int num1=objnum;
        System.out.println(num1);
    }
}
