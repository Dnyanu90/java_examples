package com.tecspeak.inheritance.ticketsystem;

public class NormalTicket extends Ticket{

    NormalTicket(int start, int dest) {
        super(start, dest);
    }
    void printFare(){
        System.out.println("Normal Fare: "+ calculateFare());
    }
}
