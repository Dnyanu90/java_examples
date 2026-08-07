package com.tecspeak.logicalquestion;

import java.util.Scanner;

public class BusFareSystem {
    static void fareSystem(int start ,int dest){
        int ful1Fare=100;
        int distance=Math.abs(start-dest);
        if ((start==1 && dest ==10)|| start==10 && dest== 1){
            System.out.println(ful1Fare);
        } else if (distance<=3) {
            System.out.println(distance*10);

        } else if (distance>3) {
            System.out.println(distance*8);
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Start Stop :");
        int start=sc.nextInt();
        System.out.println("End Stop :");
        int dest=sc.nextInt();

        fareSystem(start,dest);
    }
}
