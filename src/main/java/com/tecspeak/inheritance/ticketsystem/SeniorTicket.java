package com.tecspeak.inheritance.ticketsystem;

public class SeniorTicket extends Ticket{

    SeniorTicket(int start, int dest) {
        super(start, dest);
    }
    int calulateFare(){
        int fare=super.calculateFare();
        return (int)(fare*0.7); // 30% discount

    }
    void printFare(){
        System.out.println("Senior Citizen Fare : "+ calulateFare());
    }
}
