package com.tecspeak.basics;

public class ReverseNumber {
    static int reveseNumber(int n){
        int revese=0;
        while(n!=0){
            int digit=n%10;
            revese=revese*10+digit;
            n=n/10;


        }
        return revese;
    }
}
