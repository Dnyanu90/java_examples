package com.tecspeak.basics.strings;

public class ReverseString {
    String rev;
    public static String reverseString(String str){
        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
           rev=rev+str.charAt(i);
        }
        return  rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }
}
