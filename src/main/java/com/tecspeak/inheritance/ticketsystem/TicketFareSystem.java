package com.tecspeak.inheritance.ticketsystem;

public class TicketFareSystem {
    public static void main(String[] args) {
        NormalTicket normalTicker= new NormalTicket(2,10);
        normalTicker.printFare();
        StudentTicket studentTicker=new StudentTicket(2,10);
        studentTicker.printFare();
        SeniorTicket seniorTicket=new SeniorTicket(2,10);
        seniorTicket.printFare();
    }
}
