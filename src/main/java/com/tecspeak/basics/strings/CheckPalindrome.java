package com.tecspeak.basics.strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean ispalindrome(String s){
       for(int i=0;i<s.length()/2;i++){
           if (s.charAt(i) !=s.charAt(s.length()-1-i)){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( ispalindrome("ABDCBA"));
    }
}
