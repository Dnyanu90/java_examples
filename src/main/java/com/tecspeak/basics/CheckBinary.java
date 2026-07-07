package com.tecspeak.basics;

public class CheckBinary {
    public static boolean checkBinary(int num){
        boolean check ;
        if (num==0){
            return true;
        }while (num>0){
            int digit=num%10;
            if (digit!=0 &&digit !=1 ){
                return  false;
            }
            num=num/10;
        }

        return  true;
    }

    public static void main(String[] args) {

        System.out.println(checkBinary(10110011));
    }
}
