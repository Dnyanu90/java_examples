package com.tecspeak.basics;

public class DataTypes {
    public static void main(String[] args) {
         byte byt;
         short sh=23;
         char ch='A';
         int num=234;
         long lg=53431;
         float fl=34.5f;
         double d=3454.63454433;

      // byt=sh --> cast Exprssion
        byt =(byte)sh;
        System.out.println(byt);

        // sh=ch --> cast Expression
        // sh=(char)ch --> cast Expression
        // ch=(int)num--> cast Expression
        System.out.println("Before:"+fl);
        fl=num;
        System.out.println("After:"+fl);

    }
}

