package com.tecspeak.basics.switchCase;

import java.util.Scanner;

public class CheckOvelOrConsonant {
    public static void printOVelOrConsonant(char ch){
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Ovel");
            default:
                System.out.println("Consonant");
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        CheckOvelOrConsonant.printOVelOrConsonant(ch);

    }
}
