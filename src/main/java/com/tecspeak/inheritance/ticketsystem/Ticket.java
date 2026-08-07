package com.tecspeak.inheritance.ticketsystem;

public class Ticket {
    int start;
    int dest;
    int ratePerKm=10;

    Ticket(int start,int dest){
        this.start=start;
        this.dest=dest;

    }
    int calculateDistance(){
        return Math.abs(dest-start);
    }
    int calculateFare(){
        return calculateDistance()*ratePerKm;
    }
}
