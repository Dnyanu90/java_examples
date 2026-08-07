package com.tecspeak.logicalquestion;

import java.util.Scanner;

public class TicketSystem {
    static void ticketSystem(int start ,int dest){
        int fullpass=200;
        int n=Math.abs(start-dest);
        if ((start ==1 && dest ==1) || start ==18 && start ==1){
            System.out.println(fullpass);
        }
        else if (n<=4){
            System.out.println(n*20);
        }
        else {
            System.out.println(n*15);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Start  Station:");
        int start=sc.nextInt();
        System.out.println("Enter Dest Station:");
        int dest=sc.nextInt();
        ticketSystem(start,dest);
    }
    
}
